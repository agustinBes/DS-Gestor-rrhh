package com.practical.consultora_rrhh.excepciones.genericas;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(Long id) {
        super(id.toString());
    }
      }
