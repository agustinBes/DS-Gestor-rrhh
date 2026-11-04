package com.practical.consultora_rrhh.excepciones.especializadas.clases;

import com.practical.consultora_rrhh.excepciones.genericas.ObjectNotFoundException;

public class PreguntaNotFoundException extends ObjectNotFoundException {
    public PreguntaNotFoundException(String message) {
        super(message);
    }
}