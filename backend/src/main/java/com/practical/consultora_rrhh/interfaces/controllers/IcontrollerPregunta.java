package com.practical.consultora_rrhh.interfaces.controllers;

import com.practical.consultora_rrhh.dto.FiltrosBusqueda.PreguntaFiltrosDto;
import com.practical.consultora_rrhh.dto.request.preguntaDtoCreate;
import com.practical.consultora_rrhh.interfaces.genericas.IControllerCRUD;
import com.practical.consultora_rrhh.dto.response.preguntaDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IcontrollerPregunta extends IControllerCRUD<preguntaDto, preguntaDtoCreate> {


ResponseEntity<List<preguntaDto>> buscar(PreguntaFiltrosDto dto);

}
