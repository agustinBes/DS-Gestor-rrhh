package com.practical.consultora_rrhh.dto.response;

public record ponderacionDto(
        Long id_pregunta,
        opcionDto opcion,
        Integer puntaje
) {
}
