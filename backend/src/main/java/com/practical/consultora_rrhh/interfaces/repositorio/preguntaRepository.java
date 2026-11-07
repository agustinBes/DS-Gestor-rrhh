package com.practical.consultora_rrhh.interfaces.repositorio;

import com.practical.consultora_rrhh.modelo.clases.Pregunta;
import org.springframework.stereotype.Repository;

@Repository
public interface preguntaRepository extends IgenericsRepository<Pregunta,Long> {
boolean existsByNombreIgnoreCaseAndFactor_IdAndFactor_Competencia(String nombre, Long idFactor, Long idCompetencia);

    boolean existsByPreguntaIgnoreCaseAndFactor_IdAndFactor_Competencia_Id(String nombre, Long idFactor, Long idCompetencia);
}
