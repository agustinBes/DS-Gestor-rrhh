package com.practical.consultora_rrhh.dto.request;

import jakarta.validation.constraints.NotNull;

public record ponderacionDtoCreate(
        @NotNull(message = "Se requiere el identificador de la configuración")
        Long idOpcionRespuesta,
        @NotNull(message = "Se requiere la fila de la opción")
        Short fila,
        @NotNull(message = "Se requiere una ponderación")
        Integer ponderacion
) {


}