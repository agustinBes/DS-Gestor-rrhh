package com.practical.consultora_rrhh.validaciones;

import com.practical.consultora_rrhh.Util.TextoUtils;
import com.practical.consultora_rrhh.dto.request.opcionDtoCreate;
import com.practical.consultora_rrhh.dto.response.opcionDto;
import com.practical.consultora_rrhh.excepciones.especializadas.atributos.CantidadOpcionesInvalidException;
import com.practical.consultora_rrhh.excepciones.especializadas.atributos.DescripcionDuplicatedException;
import com.practical.consultora_rrhh.excepciones.especializadas.atributos.NombreDuplicatedException;
import com.practical.consultora_rrhh.excepciones.especializadas.atributos.OrdenNoConsecutivoException;
import com.practical.consultora_rrhh.excepciones.especializadas.clases.OpcionRespuestaNotFoundException;
import com.practical.consultora_rrhh.modelo.clases.Opcion;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
import com.practical.consultora_rrhh.repositorio.opcionRespuestaRepository;
import org.springframework.stereotype.Component;

import java.util.*;
/**
 * Componente encargado de centralizar las validaciones relacionadas
 * con la gestión de opciones de respuesta.
 *
 * Contiene las reglas de validación correspondientes a la entidad
 * OpcionRespuesta y delega las validaciones específicas de cada
 * opción a {@link OpcionValidators}.
 *
 * Ante el incumplimiento de una regla de negocio, lanza excepciones
 * personalizadas que permiten identificar el tipo de error producido.
 *
* @author  Besigniano Agustin
 @since 1.0
 */
@Component
public class OpcionRespuestaValidators {
    private final opcionRespuestaRepository repository;
    private final OpcionValidators opcionValidators;

    public OpcionRespuestaValidators(opcionRespuestaRepository repository, OpcionValidators opcionValidators) {
        this.repository = repository;
        this.opcionValidators = opcionValidators;
    }

//----------------------------------------------------------
//Parra el metodo de modificacion comprobar la existencia de la opcion x id y retornarlo
    public OpcionRespuesta existeOpcionRespuesta(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
    new OpcionRespuestaNotFoundException("El id: "+id+" no corresponde a una opcion de respuesta valida"));}

//----------------------------------------------------------
// comprobar la disponibilidad del nombre para creacion
    public void existeNombre(String nombre) {
      if(   repository.existsByNombreIgnoreCase(nombre))
      {throw new NombreDuplicatedException("El nombre ya esta en uso");}
    }
// comprobar la disponibilidad del nombre y texto para modificacion
public boolean validarAlteracionTexto(String actual, String nuevo) {
        boolean modificacion= TextoUtils.comparar(actual,nuevo);
        if(modificacion){return false;}
existeNombre(nuevo);
            return true;}



//-------------------------------------------------------------------------
    // validar Opciones asociadas a la OpcionRespuesta para la creacion

    public void validarOpciones(List<opcionDtoCreate> opcion) {

        if (!opcionValidators.ordenConsecutivo(opcion)) {
            throw new OrdenNoConsecutivoException(
                    "Las opciones deben tener un orden consecutivo comenzando desde 1");
        }

        if (!opcionValidators.descripcionUnica(opcion)) {
            throw
new DescripcionDuplicatedException("La descripciones recibida ya existe en el sistema");
        }
    }
public void validarAlteracionCantidadOpciones(Integer actual, List<opcionDtoCreate> modificacion) {
        if(actual!=opcionValidators.cantidadOpciones(modificacion)){
            throw
        new CantidadOpcionesInvalidException("No esta permitido agregar ni eliminar opciones de las que ya existian");}

        }
    public List<opcionDto> ValidarAlteracionOpcion(Long id,List<Opcion> actual, List<opcionDtoCreate> dto) {
        List<opcionDtoCreate> aux = new ArrayList<>();
        Integer modificacion = 0;

        for (int i = 0; i < actual.size(); i++) {
            Opcion x = actual.get(i);
            opcionDtoCreate opcion = dto.get(i);
            if (x.getOrden() != opcion.orden()
                    || !TextoUtils.comparar(x.getDescripcion(), opcion.descripcion())) {
                aux.add(opcion);
            modificacion++;}
            else{
                aux.add(new opcionDtoCreate(actual.get(i).getFila(),x.getOrden(),x.getDescripcion()));
            }}
        if(modificacion==0){
            return new ArrayList<>();}

this.validarOpciones(aux);
                   return aux.stream()
                    .map(o -> new opcionDto(
                            o,id))
                    .toList();
        }


    }

    //-----------------------------------------------------------





