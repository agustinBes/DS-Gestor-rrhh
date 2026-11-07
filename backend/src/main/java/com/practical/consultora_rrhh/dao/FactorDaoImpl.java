package com.practical.consultora_rrhh.dao;

import com.practical.consultora_rrhh.interfaces.dao.IFactorDao;
import com.practical.consultora_rrhh.interfaces.repositorio.factorRepository;
import com.practical.consultora_rrhh.interfaces.services.IserviceFactor;
import com.practical.consultora_rrhh.modelo.clases.Factor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FactorDaoImpl implements IFactorDao {
  private final factorRepository repository;
  public  FactorDaoImpl(factorRepository rep){
      repository = rep;
  }
    @Override
    public boolean existePorNombreInsensible(String nombre) {
        return false;
    }

    @Override
    public boolean existeCodigoInsensible(String codigo) {
        return false;
    }

    @Override
    public Factor guardar(Factor factor) {
        return null;
    }

    @Override
    public List<Factor> obtenerTodos() {
        return List.of();
    }

    @Override
    public void eliminar(Factor factor) {

    }

    @Override
    public Factor obtenerPorId(Long aLong) {
        return null;
    }

    @Override
    public void existePorId(Long aLong) {

    }
}
