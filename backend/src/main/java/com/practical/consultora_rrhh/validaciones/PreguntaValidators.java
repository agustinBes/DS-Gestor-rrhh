package com.practical.consultora_rrhh.validaciones;

import com.practical.consultora_rrhh.interfaces.dao.IPreguntaDao;
import com.practical.consultora_rrhh.validaciones.genericas.ValidatorsNombreCodigoDuplicado;
import org.springframework.stereotype.Service;

@Service
public class PreguntaValidators extends ValidatorsNombreCodigoDuplicado {
    private final IPreguntaDao dao;


public PreguntaValidators(IPreguntaDao dao) {
    super();
    this.dao = dao;
}

    public void existeNombre(String nombre) {
        super.existeNombre(dao.existePorNombreInsensible(nombre));
    }
    public void existeCodigo(String codigo) {
    super.existeCodigo(dao.existeCodigoInsensible(codigo));
    }
}
