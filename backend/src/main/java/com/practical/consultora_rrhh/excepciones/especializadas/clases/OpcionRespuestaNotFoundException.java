package com.practical.consultora_rrhh.excepciones.especializadas.clases;

import com.practical.consultora_rrhh.excepciones.genericas.ObjectNotFoundException;

public class OpcionRespuestaNotFoundException extends ObjectNotFoundException {
    public OpcionRespuestaNotFoundException(String message) {
        super(message);
    }
}