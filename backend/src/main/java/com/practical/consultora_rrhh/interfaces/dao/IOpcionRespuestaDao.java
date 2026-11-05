package com.practical.consultora_rrhh.interfaces.dao;

import com.practical.consultora_rrhh.dto.response.opcionDto;
import com.practical.consultora_rrhh.interfaces.IDaoBase;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;

import java.util.List;

public interface IOpcionRespuestaDao extends IDaoBase<Long, OpcionRespuesta> {
    OpcionRespuesta actualizar(String descripcion,OpcionRespuesta opcionRespuesta,List<opcionDto> opciones);
    List<OpcionRespuesta> obtenerPorNombreParcial(String texto);
    boolean existePorNombreInsensible(String nombre);
}
