package com.practical.consultora_rrhh.interfaces.repositorio;

import com.practical.consultora_rrhh.excepciones.especializadas.atributos.NombreDuplicatedException;
import com.practical.consultora_rrhh.excepciones.genericas.EntityNotFoundException;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface IgenericsRepository<Entity,Id> extends JpaRepository<Entity, Id> {

    boolean existsByNombreIgnoreCase(String nombre);

    default boolean existsByIdOrThrow(Id id, String message) {
        if (!existsById(id)) {
            throw new EntityNotFoundException("No existe en el sistema " + message + " con el id:" + id);
        }
        return true;
    }

    default Entity findByIdOrThrow(Id id, String message) {

        return findById(id).orElseThrow(() -> new EntityNotFoundException("No existe en el sistema " + message + " con el id:" + id));
    }

    default boolean existePorNombreOrThrow(String nombre) {
        if (existsByNombreIgnoreCase(nombre)) {
            throw new NombreDuplicatedException("el nombre" + nombre + " ya existe en el sistema");
        }
            return false;
           }
}
