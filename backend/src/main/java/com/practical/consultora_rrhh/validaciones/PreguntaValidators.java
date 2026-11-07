package com.practical.consultora_rrhh.validaciones;

import com.practical.consultora_rrhh.dto.request.preguntaDtoCreate;
import com.practical.consultora_rrhh.interfaces.dao.IPreguntaDao;
import org.springframework.stereotype.Service;

@Service
public class PreguntaValidators   {
    private final IPreguntaDao dao;

    public PreguntaValidators(IPreguntaDao dao) {
        this.dao = dao;
       }

    public void existeNombre(preguntaDtoCreate dto) {
        dao.existeNombrePorFactorInsensible(
                        dto.titulo(),
                       dto.factor().id(),
                        dto.factor().competencia().id());
    }

    public void existePregunta(preguntaDtoCreate dto) {
      dao.existePreguntaPorFactorInsensible(dto.titulo(),
                dto.factor().id(),
                dto.factor().competencia().id());
    }
}
