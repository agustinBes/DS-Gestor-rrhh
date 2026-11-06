package com.practical.consultora_rrhh.interfaces.repositorio;

import com.practical.consultora_rrhh.modelo.clases.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface preguntaRepository extends JpaRepository<Pregunta,Long> {

}
