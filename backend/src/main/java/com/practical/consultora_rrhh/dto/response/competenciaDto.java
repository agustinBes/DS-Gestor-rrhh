package com.practical.consultora_rrhh.dto.response;

import java.util.List;

public record competenciaDto(
        Long id,
        String codigo,
        List<factorDto> competencia,
        String nombre,
        String descripcion,
        String tipo
) {
}
