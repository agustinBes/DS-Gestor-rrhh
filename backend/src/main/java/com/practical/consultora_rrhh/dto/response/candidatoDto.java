package com.practical.consultora_rrhh.dto.response;

import com.practical.consultora_rrhh.modelo.clases.Candidato;
import com.practical.consultora_rrhh.modelo.enums.tipoDocumento;

import java.time.LocalDateTime;

public record candidatoDto(
         Long id,
         String nombre,String apellido,
 LocalDateTime fecha,
  String mail,
String tipo, String documento,
 String nacionalidad, char genero,
 String escolaridad
) {

public candidatoDto(Candidato x){
    this(
            x.getId(),
            x.getNombre(),
            x.getApellido(),
            x.getFecha(),
            x.getMail(),
            tipoDocumento.desdeTipo(x.getTipo()),
            x.getDocumento(),
            x.getNacionalidad(),
            x.getGenero(),
            x.getEscolaridad()
    );
}
}