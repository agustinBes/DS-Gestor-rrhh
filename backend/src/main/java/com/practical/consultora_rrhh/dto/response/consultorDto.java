package com.practical.consultora_rrhh.dto.response;

import com.practical.consultora_rrhh.modelo.clases.Consultor;

public record consultorDto(
        Long id,
        String usuario,
        short acceso
) {
    public consultorDto(Consultor x){
        this(
              x.getId(),
              x.getNombre(),
                x.getNivelAcceso()
        );
    }
}
