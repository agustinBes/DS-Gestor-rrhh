package com.practical.consultora_rrhh.interfaces;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IControllerCRUD<DtoResponse,DtoRequest> {

 ResponseEntity<DtoResponse> guardar(DtoRequest dto);

 ResponseEntity<DtoResponse> actualizar(Long id,DtoRequest dto);

 ResponseEntity<String> eliminar(Long id);

 ResponseEntity<List<DtoResponse>> obtenerTodos();

 ResponseEntity<DtoResponse> obtenerPorId(Long id);
}