package com.practical.consultora_rrhh.interfaces.services;

import jakarta.persistence.Entity;

public interface IvalidarExistenciaNombreCodigoService<Dto> {
    void existePorNombreInsensible(String nombre);
    void existeCodigoInsensible(String codigo);
}
