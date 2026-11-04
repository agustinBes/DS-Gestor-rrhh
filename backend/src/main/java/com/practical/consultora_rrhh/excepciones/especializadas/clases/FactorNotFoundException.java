package com.practical.consultora_rrhh.excepciones.especializadas.clases;

import com.practical.consultora_rrhh.excepciones.genericas.ObjectNotFoundException;

public class FactorNotFoundException extends ObjectNotFoundException {
    public FactorNotFoundException(String message) {
        super(message);
    }

}
