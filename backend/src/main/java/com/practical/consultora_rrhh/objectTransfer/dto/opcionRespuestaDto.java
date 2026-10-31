package com.practical.consultora_rrhh.objectTransfer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Usado para transferir informacion ademas de la gestion de creacion y modificacion
 *
 * @author  Besigniano Agustin
 * @since 1.0
 *
 * dto abierto a modificaciones futuras de ser requerido o rediseñado con mas de 1 dto para cada entidad persistida
 *
 */
public record opcionRespuestaDto(
        @NotNull
        Long pregunta,
        @NotNull
        Long opcion,
        @NotBlank
        Integer puntaje
) {
}
