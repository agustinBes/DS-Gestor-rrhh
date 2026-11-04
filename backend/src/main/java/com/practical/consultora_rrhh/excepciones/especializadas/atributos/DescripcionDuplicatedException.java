package com.practical.consultora_rrhh.excepciones.especializadas.atributos;

import com.practical.consultora_rrhh.excepciones.genericas.DuplicatedException;

public class DescripcionDuplicatedException extends DuplicatedException {
    public DescripcionDuplicatedException(String message) {
        super(message);
    }
}
