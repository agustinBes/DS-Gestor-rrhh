package com.practical.consultora_rrhh.dto.response;

import com.practical.consultora_rrhh.modelo.clases.Auditoria;
import com.practical.consultora_rrhh.modelo.enums.tipoAuditoria;

import java.time.LocalDateTime;

public record auditoriaDto(
        Long id,
        String registro,
        String tipo,
        LocalDateTime fecha,
       usuarioDto consultor
) {
    public auditoriaDto(Auditoria x){
        this(
                x.getId(),
                x.getRegistroEliminado(),
                tipoAuditoria.desdeTipo(x.getAuditoria()),
            x.getFecha(),
            new usuarioDto(x.getResponsable())
        );
    }

    }
