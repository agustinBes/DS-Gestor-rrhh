package com.practical.consultora_rrhh.excepciones.genericas;

public class DuplicatedException extends RuntimeException {

    public DuplicatedException(String message) {
        super(message);
    }

}