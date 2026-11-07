package com.practical.consultora_rrhh.services;

import com.practical.consultora_rrhh.dto.request.preguntaDtoCreate;
import com.practical.consultora_rrhh.dto.response.factorDto;
import com.practical.consultora_rrhh.interfaces.dao.IFactorDao;
import com.practical.consultora_rrhh.interfaces.services.IserviceFactor;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceFactor implements IserviceFactor {
private final IFactorDao dao;
public ServiceFactor(IFactorDao dao) {
        this.dao = dao;
}

    @Override
    public factorDto guardar(preguntaDtoCreate dto) {
        return null;
    }

    @Override
    public factorDto actualizar(Id id, preguntaDtoCreate dto) {
        return null;
    }

    @Override
    public List<factorDto> obtenerTodos() {
        return List.of();
    }

    @Override
    public void eliminar(Id id) {

    }

    @Override
    public factorDto obtenerPorId(Id id) {
        return null;
    }

    @Override
    public boolean validarExistencia(Long id) {
        return false;
    }

    @Override
    public void existePorNombreInsensible(String nombre) {

    }

    @Override
    public void existeCodigoInsensible(String codigo) {

    }


}
