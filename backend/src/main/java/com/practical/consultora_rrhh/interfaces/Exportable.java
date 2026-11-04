package com.practical.consultora_rrhh.interfaces;

public interface Exportable<T> {
    public abstract boolean  exportar(T archivo);
}
