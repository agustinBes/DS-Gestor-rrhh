package com.practical.consultora_rrhh.controllers;

import com.practical.consultora_rrhh.dto.response.auditoriaDto;
import com.practical.consultora_rrhh.services.ServiceAuditoria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/auditorias")
public class ControllerAuditoria {

    private final ServiceAuditoria service;

    public ControllerAuditoria(ServiceAuditoria service) {
        this.service = service;
    }

    @GetMapping("/")
    public String inicio() {
        return "Servidor de Auditorias funcionando";
    }


    @GetMapping("/lista")
    public ResponseEntity<List<auditoriaDto>> obtenerTodos() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

}