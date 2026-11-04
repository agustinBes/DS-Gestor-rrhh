package com.practical.consultora_rrhh.services;

import com.practical.consultora_rrhh.Util.TextoUtils;
import com.practical.consultora_rrhh.dao.OpcionRespuestaDao;
import com.practical.consultora_rrhh.dto.request.opcionRespuestaDtoCreate;
import com.practical.consultora_rrhh.dto.response.opcionDto;
import com.practical.consultora_rrhh.dto.response.opcionRespuestaDto;
import com.practical.consultora_rrhh.excepciones.especializadas.clases.OpcionRespuestaNotFoundException;
import com.practical.consultora_rrhh.excepciones.genericas.CollectionNotFoundException;
import com.practical.consultora_rrhh.interfaces.services.IserviceOpcionRespuesta;
import com.practical.consultora_rrhh.modelo.clases.Opcion;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
import com.practical.consultora_rrhh.validaciones.OpcionRespuestaValidators;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

/**Servicio para gestionar la logica de negocio y validaciones de datos correspondientes
 * a los campos de una opciones de respuesta
 * Internamente controla las validaciones y logica de la clase Opcion tambien
 *
 * Utilizamos clases validators para mantener el codigo del servicio lo mas limpio posible
 *
 * @author  Besigniano Agustin
 * @Since 1.0
 */
@Service
public class ServiceOpcionRespuestaD implements IserviceOpcionRespuesta {

    private final OpcionRespuestaDao dao;
    // implementar mas adelante la eliminacion private final serviceAuditoria auditoria;
    private final OpcionRespuestaValidators validators;

    public ServiceOpcionRespuestaD(OpcionRespuestaDao dao, OpcionRespuestaValidators validators) {
        this.dao = dao;
        this.validators = validators;
    }
//--------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------
    @Override
    public opcionRespuestaDto guardar(opcionRespuestaDtoCreate dto) {

        validators.existeNombre(TextoUtils.normalizar(dto.nombre()));
        validators.validarOpciones(dto.opciones());

        OpcionRespuesta entidad = new OpcionRespuesta(dto);

        OpcionRespuesta guardada = dao.guardar(entidad);

        return new opcionRespuestaDto(guardada);
    }
//--------------------------------------------------------------------------------

    @Override
    @Transactional
    public opcionRespuestaDto actualizar(Long id, opcionRespuestaDtoCreate dto) {
        OpcionRespuesta actual = validators.existeOpcionRespuesta(id);
        boolean descripcion;
        descripcion = validators.validarAlteracionTexto(actual.getDescripcion(), dto.descripcion());
        validators.validarAlteracionCantidadOpciones(actual.getOpciones().size(), dto.opciones());
        validators.validarOpciones(dto.opciones());
        if (descripcion) {
            actual.setDescripcion(dto.descripcion());
        }
        List<opcionDto> aux = validators.ValidarAlteracionOpcion(id, actual.getOpciones(), dto.opciones());

        if (!aux.isEmpty()) {
            actual.setOpciones(
                    aux.stream()
                            .map(Opcion::new)
                            .toList());
        }
        return new opcionRespuestaDto(actual);
    }

    //----------------------------------------------------------
    @Override
    public List<opcionRespuestaDto> obtenerTodos() {
        List<opcionRespuestaDto> lista;
        lista = dao.obtenerTodos()
                .stream()
                .map(opcionRespuestaDto::new)
                .toList();
        if (lista.isEmpty()) {
            throw new CollectionNotFoundException("No se encontraron resultados de busquda");
        }
        return lista;
    }

    @Override
    public void eliminar(Long id) {
        OpcionRespuesta aux = dao.obtenerPorId(id)
                .orElseThrow(() ->
                        new OpcionRespuestaNotFoundException("No existe opcion de respuesta con el ID:" + id));
        // auditoria.generarAuditoria(PREGUNTA, usuario, aux.getNombre());
        dao.eliminar(aux);
    }

    //--------------------------------------------------------------
    @Override
    public opcionRespuestaDto obtenerPorId(Long id) {

        OpcionRespuesta aux = dao.obtenerPorId(id)
                .orElseThrow(() ->
                        new OpcionRespuestaNotFoundException("No se encontró opcion de respuesta con el ID:" + id));

        return new opcionRespuestaDto(aux);
    }

    @Override
    public List<opcionRespuestaDto> obtenerPorNombre(String nombre) {
        List<opcionRespuestaDto> lista;
        lista = dao.obtenerPorNombreContiene(nombre)
                .stream()
                .map(opcionRespuestaDto::new)
                .toList();
        if (lista.isEmpty()) {
             throw new CollectionNotFoundException("No se encontraron resultados de busquda");
        }
        return lista;
    }

//--------------------------------------------------------------

}