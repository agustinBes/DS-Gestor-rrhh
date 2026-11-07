package com.practical.consultora_rrhh.interfaces.services;

import com.practical.consultora_rrhh.dto.request.opcionRespuestaDtoCreate;
import com.practical.consultora_rrhh.dto.response.opcionRespuestaDto;

import java.util.List;

public interface IserviceOpcionRespuesta extends IserviceCRUD<Long, opcionRespuestaDto, opcionRespuestaDtoCreate> {

    public List<opcionRespuestaDto> obtenerPorNombre(String nombre);

}
