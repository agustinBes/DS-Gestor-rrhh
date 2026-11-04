package com.practical.consultora_rrhh.excepciones.especializadas.atributos;

import com.practical.consultora_rrhh.excepciones.genericas.AtributoInvalidException;

public class OrdenNoConsecutivoException extends AtributoInvalidException {
    public OrdenNoConsecutivoException(String s) {
        super(s);
    }
}
