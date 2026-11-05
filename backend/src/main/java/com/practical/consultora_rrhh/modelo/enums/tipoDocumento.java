package com.practical.consultora_rrhh.modelo.enums;

public enum tipoDocumento {
    DNI,
    LE,
    LC,
    PP;

    public static tipoDocumento desdeString(String valor) {
        return tipoDocumento.valueOf(valor.toUpperCase());
    }
    public static String desdeTipo(tipoDocumento x) {
        return x.name();
    }
}

