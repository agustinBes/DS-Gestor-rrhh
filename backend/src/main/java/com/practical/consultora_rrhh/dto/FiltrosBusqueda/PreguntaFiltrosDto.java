package com.practical.consultora_rrhh.dto.FiltrosBusqueda;

public record PreguntaFiltrosDto(
        String nombreCompetencia,
        Long codigoCompetencia,
        String nombreFactor,
        Long codigoFactor,
        String nombrePregunta) {
}
