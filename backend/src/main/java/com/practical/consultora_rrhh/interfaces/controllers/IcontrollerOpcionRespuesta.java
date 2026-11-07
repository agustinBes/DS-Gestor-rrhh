package com.practical.consultora_rrhh.interfaces.controllers;

import com.practical.consultora_rrhh.dto.request.opcionRespuestaDtoCreate;
import com.practical.consultora_rrhh.dto.response.opcionRespuestaDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IcontrollerOpcionRespuesta extends IControllerCRUD<opcionRespuestaDto, opcionRespuestaDtoCreate> {

    public ResponseEntity<List<opcionRespuestaDto>> obtenerPorNombre(String nombre);
}
