package com.practical.consultora_rrhh.services;

import com.practical.consultora_rrhh.Util.TextoUtils;
import com.practical.consultora_rrhh.dto.request.opcionRespuestaDtoCreate;
import com.practical.consultora_rrhh.dto.response.opcionDto;
import com.practical.consultora_rrhh.dto.response.opcionRespuestaDto;
import com.practical.consultora_rrhh.excepciones.genericas.CollectionNotFoundException;
import com.practical.consultora_rrhh.interfaces.dao.IOpcionRespuestaDao;
import com.practical.consultora_rrhh.interfaces.services.IserviceOpcionRespuesta;
import com.practical.consultora_rrhh.modelo.clases.Opcion;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
import com.practical.consultora_rrhh.validaciones.OpcionRespuestaValidators;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  Servicio encargado de gestionar la lógica de negocio y las validaciones
 * pertinentes a una {@link OpcionRespuesta}.
 *
 * <p>Las validaciones comprenden aspectos relacionados con el formato,
 * tipo de datos y restricciones de unicidad de determinados campos.</p>
 *
 * <p>También gestiona las operaciones y validaciones relacionadas con la
 * entidad {@link Opcion}, cuya existencia está sujeta al ciclo de vida
 * de la {@link OpcionRespuesta}.</p>
 *
 * <p>Se delegan las validaciones en clases Validators para mantener el
 * código organizado y facilitar su mantenimiento.</p>
 *
 * @author  Besigniano Agustin
 * @Since 1.0
 */
@Service
public class ServiceOpcionRespuesta implements IserviceOpcionRespuesta {

     private final IOpcionRespuestaDao dao;
    private final OpcionRespuestaValidators validators;

    public ServiceOpcionRespuesta(IOpcionRespuestaDao dao, OpcionRespuestaValidators validators) {
        this.dao = dao;
        this.validators = validators;
    }
    //--------------------------------------------------------------------------------

    /**
     Valida el formato de los campos y verifica que no existan conflictos
     * de duplicidad en la base de datos.
     *
     * <p>Ante cualquier incumplimiento, lanza las excepciones personalizadas
     * correspondientes. Si las validaciones son satisfactorias, registra una
     * nueva {@link OpcionRespuesta} junto con su lista de {@link Opcion}.</p>
     */
    @Override
    public opcionRespuestaDto guardar(opcionRespuestaDtoCreate dto) {

        validators.existeNombre(TextoUtils.normalizar(dto.nombre()));
        validators.validarFormatoOpciones(dto.opciones());

        OpcionRespuesta entidad = new OpcionRespuesta(dto);

        OpcionRespuesta guardada = dao.guardar(entidad);

        return new opcionRespuestaDto(guardada);
    }
//--------------------------------------------------------------------------------

    /**
     * La siguiente funcion se encarga de actualizar(parcialmente) la entidad persistida en la bdd.
     *
     * @param id Identificador de la entidad persistida en la bdd a modificar. Verificamos existencia como primer validacion
     * @return
     */
    @Override
    public opcionRespuestaDto actualizar(Long id, opcionRespuestaDtoCreate dto) {

        OpcionRespuesta actual = validators.existeOpcionRespuesta(id);

       boolean descripcion=validators.validarFormatoModificaciones(id,actual,dto);

        List<opcionDto> aux = validators.ValidarAlteracionOpcion(id, actual.getOpciones(), dto.opciones());
        OpcionRespuesta nueva;

        if(descripcion || !aux.isEmpty()) {
            nueva = dao.actualizar(descripcion ? dto.descripcion() : null, actual, aux);
            return new opcionRespuestaDto(nueva);
        }
        return new opcionRespuestaDto(actual);

        }

    //----------------------------------------------------------

    /**
     * Listar todas las opciones de respuesta existentes de la Base de datos
     * @return Puede contener elementos o representar la lista vacia
     */
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

    /**
     * Validar existencia de la entidad en la BDD y eliminarla
     *Implementar: Generar registro de auditoria
     * @param id
     */
    @Override
    public void eliminar(Long id) {
        OpcionRespuesta aux = validators.existeOpcionRespuesta(id);
        dao.eliminar(aux);
    }

    /**
     * Obtener una opcion de respuesta o lanzar mensaje si no existe
     */
    @Override
    public opcionRespuestaDto obtenerPorId(Long id) {

        OpcionRespuesta aux = validators.existeOpcionRespuesta(id);

        return new opcionRespuestaDto(aux);
    }

    /**
     * Obtiene una lista de opciones de respuesta cuyo nombre coincide parcialmente
     * con el texto proporcionado.
     *
     * @param nombre texto utilizado como filtro de búsqueda por coincidencia parcial.
     */
    @Override
    public List<opcionRespuestaDto> obtenerPorNombre(String nombre) {
        List<opcionRespuestaDto> lista;
        lista = dao.obtenerPorNombreParcial(nombre)
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