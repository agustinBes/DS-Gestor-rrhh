package com.practical.consultora_rrhh.dto.response;

public record factorDto(
        Long id,
        String codigo,
        competenciaDto competencia,
        String nombre,
        String orden

) {
}
