package com.practical.consultora_rrhh.modelo.enums;

public enum tipoCompetencia {
    TECNICA,
    ACTITUDINAL,
    GENERICA;

    public static tipoCompetencia desdeString(String valor) {
        return tipoCompetencia.valueOf(valor.toUpperCase());
    }
    public static String desdeTipo(tipoCompetencia x) {
        return x.name();
    }
    
    
    
}
