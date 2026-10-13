package com.practical.consultora_rrhh.modelo.interfaces;

import java.util.List;
import java.util.Optional;

public interface IcontrollerCRUD<Dto>{
 boolean  guardar(Dto dto);
Dto actualizar(Long id,Dto dto);
 void  eliminar(Long id);
 List<Dto> obtenerTodos();
 Optional<Dto> obtenerPorId(Long id);

}
