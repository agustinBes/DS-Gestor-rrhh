package com.practical.consultora_rrhh.excepciones.especializadas.atributos;

import com.practical.consultora_rrhh.excepciones.genericas.DuplicatedException;

public class CodigoDuplicatedException extends DuplicatedException {
    public CodigoDuplicatedException(String message) {
        super(message);
    }
}
