package com.practical.consultora_rrhh.dto.response;

public record preguntaDto(
        Long id,
        factorDto factor,
        String nombre,
        String pregunta,
        String descripcion,
        opcionRespuestaDto respuesta,
        List<ponderacionDto> ponderaciones
) {
}
