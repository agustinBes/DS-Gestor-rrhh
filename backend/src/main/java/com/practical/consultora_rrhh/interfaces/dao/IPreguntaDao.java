package com.practical.consultora_rrhh.interfaces.dao;

import com.practical.consultora_rrhh.dto.FiltrosBusqueda.PreguntaFiltrosDto;
import com.practical.consultora_rrhh.interfaces.genericas.IDaoBase;
import com.practical.consultora_rrhh.interfaces.genericas.IvalidarNombreCodigo;
import com.practical.consultora_rrhh.modelo.clases.Pregunta;

import java.util.List;

public interface IPreguntaDao extends IDaoBase<Long, Pregunta> , IvalidarNombreCodigo {
    List<Pregunta> buscar(PreguntaFiltrosDto filtros);
}
