package com.practical.consultora_rrhh.objectTransfer.dto;

import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
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
public record preguntaDto(
        @NotNull
        Long id,
        @NotBlank
        factorDto factor,
        @NotBlank
        String titulo,
        @NotBlank
        String pregunta,
        @NotNull
        String descripcion,
        @NotNull
        List<opcionRespuestaDto> opciones
) {
}
