package com.practical.consultora_rrhh.modelo.interfaces;

public interface Exportable<T> {
    public abstract boolean  exportar(T archivo);
}
