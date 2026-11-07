package com.practical.consultora_rrhh.services;

import com.practical.consultora_rrhh.dto.FiltrosBusqueda.PreguntaFiltrosDto;
import com.practical.consultora_rrhh.dto.request.preguntaDtoCreate;
import com.practical.consultora_rrhh.dto.response.opcionRespuestaDto;
import com.practical.consultora_rrhh.dto.response.preguntaDto;
import com.practical.consultora_rrhh.interfaces.dao.IPreguntaDao;
import com.practical.consultora_rrhh.interfaces.services.IserviceFactor;
import com.practical.consultora_rrhh.interfaces.services.IserviceOpcionRespuesta;
import com.practical.consultora_rrhh.interfaces.services.IservicePregunta;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
import com.practical.consultora_rrhh.validaciones.PreguntaValidators;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServicePregunta implements IservicePregunta {
    private final PreguntaValidators validators;
    private final IPreguntaDao dao;
    private final IserviceFactor serviceFactor;
    private final IserviceOpcionRespuesta serviceOpcionRespuesta;
    public ServicePregunta(PreguntaValidators validators, IPreguntaDao dao, IserviceFactor serviceFactor, IserviceOpcionRespuesta serviceOpcionRespuesta ) {
        this.validators = validators;
        this.dao = dao;
 this.serviceFactor = serviceFactor;
    this.serviceOpcionRespuesta = serviceOpcionRespuesta;
    }
    @Override
    public List<preguntaDto> buscar(PreguntaFiltrosDto dto) {


        return List.of();
    }

    @Override
    public preguntaDto guardar(preguntaDtoCreate dto) {

serviceFactor.validarExistencia(dto.factor().id());

opcionRespuestaDto opcionRespuestaDto=serviceOpcionRespuesta.obtenerPorId(dto.opcionRespuesta()) ;

        validators.existeNombre(dto);
        validators.existePregunta(dto);

        return null;
    }

    public preguntaDto actualizar(Long aLong, preguntaDtoCreate dto) {
        return null;
    }

    public List<preguntaDto> obtenerTodos() {
        return List.of();
    }

    public void eliminar(Long aLong) {

    }

    public preguntaDto obtenerPorId(Long aLong) {
        return null;
    }

    public boolean validarExistencia(Long id) {
         dao.existePorId(id);
   return true;
    }
}
