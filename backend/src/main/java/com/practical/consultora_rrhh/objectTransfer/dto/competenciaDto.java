package com.practical.consultora_rrhh.objectTransfer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;
/**
 * Usado para transferir informacion ademas de la gestion de creacion y modificacion
 *
 * @author  Besigniano Agustin
 * @since 1.0
 *
 * dto abierto a modificaciones futuras de ser requerido o rediseñado con mas de 1 dto para cada entidad persistida
 *
 */
public record competenciaDto(
        @NotNull
        Long id,
        @NotBlank
        Integer competencia,
        @NotNull
        String nombre,
        @NotNull
        String tipo,
        @NotNull
        String descripcion,
        @NotNull
        List<factorDto> factores) {
}
