package com.practical.consultora_rrhh.interfaces.repositorio;

import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface opcionRespuestaRepository extends JpaRepository<OpcionRespuesta, Long> {
 List<OpcionRespuesta>  findByNombreContaining(String id);
boolean existsByNombreIgnoreCase(String nombre);
}
