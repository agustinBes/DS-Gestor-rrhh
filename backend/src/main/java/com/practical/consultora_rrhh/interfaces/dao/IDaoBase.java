package com.practical.consultora_rrhh.interfaces.dao;

import java.util.List;

public interface IDaoBase<Id, Entity> {

    Entity guardar(Entity entity);

    List<Entity> obtenerTodos();

    void eliminar(Entity entity);

    Entity obtenerPorId(Id id);

    void  existePorId(Id id);
}