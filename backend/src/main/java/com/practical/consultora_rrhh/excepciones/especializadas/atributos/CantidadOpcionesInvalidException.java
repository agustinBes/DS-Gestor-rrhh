package com.practical.consultora_rrhh.excepciones.especializadas.atributos;

import com.practical.consultora_rrhh.excepciones.genericas.AtributoInvalidException;

public class CantidadOpcionesInvalidException extends AtributoInvalidException {
    public CantidadOpcionesInvalidException(String message) {
        super(message);
    }
}
