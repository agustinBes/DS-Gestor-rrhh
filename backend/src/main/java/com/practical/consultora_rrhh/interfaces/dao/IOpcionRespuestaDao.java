package com.practical.consultora_rrhh.interfaces.dao;

import com.practical.consultora_rrhh.interfaces.IDaoCRUD;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;

import java.util.List;

public interface IOpcionRespuestaDao extends IDaoCRUD<Long, OpcionRespuesta> {

    List<OpcionRespuesta> obtenerPorNombreContiene(String texto);
    boolean existePorNombreInsensible(String nombre);
}
