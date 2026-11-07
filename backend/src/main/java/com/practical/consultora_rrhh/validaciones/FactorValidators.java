package com.practical.consultora_rrhh.validaciones;

import com.practical.consultora_rrhh.interfaces.dao.IFactorDao;

public class FactorValidators   {
private final IFactorDao dao;
public FactorValidators(IFactorDao dao) {
    this.dao=dao;
}
    public void existeNombre(String nombre) {
        dao.existePorNombreInsensible(nombre);
    }
    public void existeCodigo(String nombre) {
        dao.existePorNombreInsensible(nombre);
    }


}
