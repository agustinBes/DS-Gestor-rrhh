package com.practical.consultora_rrhh.objectTransfer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Map;
/**
 * Usado para transferir informacion ademas de la gestion de creacion y modificacion
 *
 * @author  Besigniano Agustin
 * @since 1.0
 *
 * dto abierto a modificaciones futuras de ser requerido o rediseñado con mas de 1 dto para cada entidad persistida
 *
 * Es posible que se requiera modificar el mapa para las futuras funcionalidades requeridas
 *
 */
public record puestoDto<caracteristicas>(
        @NotNull
        Long id,
        @NotBlank
        Integer codigo,
        @NotBlank
         String puesto,
        @NotBlank
        String empresa,
        @NotNull
        String informacion,
        @NotBlank
        Map<Integer,Integer > caracteristicas) {
       }
