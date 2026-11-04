package com.practical.consultora_rrhh.excepciones.especializadas.clases;

import com.practical.consultora_rrhh.excepciones.genericas.ObjectNotFoundException;

public class PuestoNotFoundException extends ObjectNotFoundException {
    public PuestoNotFoundException(String message) {
        super(message);
    }
}
