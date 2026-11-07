package com.practical.consultora_rrhh.interfaces.repositorio;

import com.practical.consultora_rrhh.modelo.clases.Factor;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

@Repository
public interface factorRepository extends IgenericsRepository<Factor, Id>{
}
