package com.practical.consultora_rrhh.dto.response;

import com.practical.consultora_rrhh.modelo.clases.Auditoria;
import com.practical.consultora_rrhh.modelo.enums.tipoAuditoria;
<<<<<<< HEAD

=======
>>>>>>> 68fe2f3 (recuperando cambios de modelos, DTO y gestores)
import java.time.LocalDateTime;

public record auditoriaDto(
        Long id,
        String registro,
        String tipo,
        LocalDateTime fecha,
<<<<<<< HEAD
       usuarioDto consultor
=======
       consultorDto consultor
>>>>>>> 68fe2f3 (recuperando cambios de modelos, DTO y gestores)
) {
    public auditoriaDto(Auditoria x){
        this(
                x.getId(),
                x.getRegistroEliminado(),
                tipoAuditoria.desdeTipo(x.getAuditoria()),
            x.getFecha(),
<<<<<<< HEAD
            new usuarioDto(x.getResponsable())
=======
            new consultorDto( x.getResponsable())
>>>>>>> 68fe2f3 (recuperando cambios de modelos, DTO y gestores)
        );
    }

    }
