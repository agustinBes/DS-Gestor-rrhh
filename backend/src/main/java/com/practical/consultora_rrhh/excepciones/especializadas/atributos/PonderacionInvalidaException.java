package com.practical.consultora_rrhh.excepciones.especializadas.atributos;

import com.practical.consultora_rrhh.excepciones.genericas.AtributoInvalidException;

public class PonderacionInvalidaException extends AtributoInvalidException {
    public PonderacionInvalidaException(String message) {
        super(message);
    }
}
