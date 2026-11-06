package com.practical.consultora_rrhh.services;

import com.practical.consultora_rrhh.dto.FiltrosBusqueda.PreguntaFiltrosDto;
import com.practical.consultora_rrhh.dto.request.preguntaDtoCreate;
import com.practical.consultora_rrhh.dto.response.preguntaDto;
import com.practical.consultora_rrhh.interfaces.dao.IPreguntaDao;
import com.practical.consultora_rrhh.interfaces.services.IservicePregunta;
import com.practical.consultora_rrhh.validaciones.PreguntaValidators;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServicePregunta implements IservicePregunta {
    private final PreguntaValidators validators;
    private final IPreguntaDao dao;
    public ServicePregunta(PreguntaValidators validators, IPreguntaDao dao) {
        this.validators = validators;
        this.dao = dao;
    }
    @Override
    public List<preguntaDto> buscar(PreguntaFiltrosDto dto) {
        validators.existeNombre(dto.nombrePregunta());

        return List.of();
    }

    @Override
    public preguntaDto guardar(preguntaDtoCreate dto) {

        return null;
    }

    @Override
    public preguntaDto actualizar(Long aLong, preguntaDtoCreate dto) {
        return null;
    }

    @Override
    public List<preguntaDto> obtenerTodos() {
        return List.of();
    }

    @Override
    public void eliminar(Long aLong) {

    }

    @Override
    public preguntaDto obtenerPorId(Long aLong) {
        return null;
    }
}
