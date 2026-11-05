package com.practical.consultora_rrhh.interfaces.repositorio;

import com.practical.consultora_rrhh.modelo.clases.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface auditoriaRepository extends JpaRepository<Auditoria,Long> {
}
