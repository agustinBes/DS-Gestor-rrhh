package com.practical.consultora_rrhh.dto.response;

import com.practical.consultora_rrhh.modelo.clases.Opcion;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;

import java.util.List;

/**
 * Usado para transferir informacion ademas de la gestion de creacion y modificacion
 *
 * @author  Besigniano Agustin
 * @since 1.0
 *
 *
 */
public record opcionRespuestaDto(
        Long id,
        String nombre,
        String descripcion,
        List<opcionDto> opciones)
 {

  public opcionRespuestaDto(OpcionRespuesta x){
   this(
       x.getId(),
           x.getNombre(),
           x.getDescripcion(),
           x.getOpciones().stream()
                   .map(opcionDto::new)
                   .toList());
                   }


}
