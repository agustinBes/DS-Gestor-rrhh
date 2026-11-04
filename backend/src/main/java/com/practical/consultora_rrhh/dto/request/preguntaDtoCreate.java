package com.practical.consultora_rrhh.dto.request;

import com.practical.consultora_rrhh.dto.response.opcionRespuestaDto;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
public record preguntaDtoCreate(

        @NotNull(message = "Se requiere un factor")
        Long factor,

        @NotBlank(message = "Se requiere un título para guardar la pregunta")
        @Size(max = 30, message = "Longitud del título excedida")
        String titulo,

        @NotBlank(message = "Se requiere una pregunta")
        @Size(max = 70, message = "Longitud de la pregunta excedida")
        String pregunta,

        @NotBlank(message = "Se requiere una descripción para orientar al usuario")
        String descripcion,

        @NotNull(message = "Se requiere una configuración de opciones")
        Long opcionRespuesta,

        @NotEmpty(message = "Se requiere al menos una ponderación")
        List<@Valid ponderacionDtoCreate> ponderaciones

) {



}
