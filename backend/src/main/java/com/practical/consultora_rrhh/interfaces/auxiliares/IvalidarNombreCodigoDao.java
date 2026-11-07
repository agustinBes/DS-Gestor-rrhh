package com.practical.consultora_rrhh.interfaces.auxiliares;

public interface IvalidarNombreCodigoDao {
    boolean existePorNombreInsensible(String nombre);
    boolean existeCodigoInsensible(String codigo);

}
