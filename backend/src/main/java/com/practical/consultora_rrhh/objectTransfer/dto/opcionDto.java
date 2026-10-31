package com.practical.consultora_rrhh.objectTransfer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record opcionDto(
        @NotNull
        Long id,
        @NotBlank
        String nombre,
        @NotNull
        String descripcion
) {
}
