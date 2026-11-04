package com.practical.consultora_rrhh.excepciones.especializadas.clases;

import com.practical.consultora_rrhh.excepciones.genericas.ObjectNotFoundException;

public class CompetenciaNotFoundException extends ObjectNotFoundException {
    public CompetenciaNotFoundException(String message) {
        super(message);
    }
}
