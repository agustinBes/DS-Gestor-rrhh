package com.practical.consultora_rrhh.dto.response;

import com.practical.consultora_rrhh.modelo.clases.Consultor;

public record usuarioDto(
        Long id,
        String nombre
) {

public usuarioDto(Consultor x){
    this(
            x.getId(),
            x.getNombre()

   );}

}