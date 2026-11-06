package com.practical.consultora_rrhh.dto.response;

import com.practical.consultora_rrhh.dto.request.opcionDtoCreate;
import com.practical.consultora_rrhh.modelo.clases.Opcion;

public record opcionDto(
        short fila,
        short orden,
        String descripcion

) {

public opcionDto(Opcion x){
    this(
            x.getFila(),
            x.getOrden(),
            x.getDescripcion());
}
public opcionDto(opcionDtoCreate x, Long id){
    this(
            x.fila(),
            x.orden(),
            x.descripcion());
}
}
