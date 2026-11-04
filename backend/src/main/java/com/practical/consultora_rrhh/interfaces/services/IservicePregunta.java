package com.practical.consultora_rrhh.interfaces.services;

import com.practical.consultora_rrhh.dto.FiltrosBusqueda.PreguntaFiltrosDto;
import com.practical.consultora_rrhh.dto.request.preguntaDtoCreate;
import com.practical.consultora_rrhh.dto.response.preguntaDto;
import com.practical.consultora_rrhh.interfaces.IserviceCRUD;

import java.util.List;

public interface IservicePregunta extends IserviceCRUD<Long,preguntaDto, preguntaDtoCreate> {


    List<preguntaDto> buscar(PreguntaFiltrosDto dto);
}
