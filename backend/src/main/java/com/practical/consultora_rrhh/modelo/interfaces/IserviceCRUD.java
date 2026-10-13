package com.practical.consultora_rrhh.modelo.interfaces;

import java.util.List;
import java.util.Optional;

public interface IserviceCRUD <Dto,Clase>{
Clase guardar(Dto dto);
Clase actualizar(Long id,Dto dto);
List<Clase>  obtenerTodos();
boolean eliminar(Long id);
Optional<Clase> obtenerPorId(Long id);
}
