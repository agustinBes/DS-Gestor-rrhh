package com.practical.consultora_rrhh.interfaces;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public interface Iactualizable extends IDaoBase<Id, Entity> {
    Entity actualizarNombre(String nombre,Entity entity);
    Entity actualizarDescripcion(String descripcion,Entity entity);

}
