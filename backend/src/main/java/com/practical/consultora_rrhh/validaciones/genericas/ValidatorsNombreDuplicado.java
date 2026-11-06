package com.practical.consultora_rrhh.validaciones.genericas;

import com.practical.consultora_rrhh.excepciones.especializadas.atributos.NombreDuplicatedException;
import org.springframework.stereotype.Service;

@Service
public abstract  class ValidatorsNombreDuplicado {

    public void existeNombre(boolean x) {
        if (x) {
            throw new NombreDuplicatedException("El nombre ya esta en uso");
        }
    }


}
