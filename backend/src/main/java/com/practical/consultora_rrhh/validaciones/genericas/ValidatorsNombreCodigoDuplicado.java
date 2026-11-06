package com.practical.consultora_rrhh.validaciones.genericas;

import com.practical.consultora_rrhh.excepciones.especializadas.atributos.CodigoDuplicatedException;
import com.practical.consultora_rrhh.interfaces.dao.IPreguntaDao;

public class ValidatorsNombreCodigoDuplicado extends ValidatorsNombreDuplicado {


    public ValidatorsNombreCodigoDuplicado() {
        super();
    }

    public void existeCodigo(boolean x) {
        if (x) {
            throw new CodigoDuplicatedException("El codigo ya esta en uso");
        }
    }
}
