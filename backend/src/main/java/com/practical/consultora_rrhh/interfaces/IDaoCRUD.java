package com.practical.consultora_rrhh.interfaces;

import java.util.List;
import java.util.Optional;

public interface IDaoCRUD<Id, Entity> {

    Entity guardar(Entity entity);

    Entity actualizar(Id id, Entity entity);

    List<Entity> obtenerTodos();

    void eliminar(Entity entity);

    Optional<Entity> obtenerPorId(Id id);
}