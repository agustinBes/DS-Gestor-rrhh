package com.practical.consultora_rrhh.excepciones.genericas;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(Long id) {
        super(id.toString());
    }
      }
