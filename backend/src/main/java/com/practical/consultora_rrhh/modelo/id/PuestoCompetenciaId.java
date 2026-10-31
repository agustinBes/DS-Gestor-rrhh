package com.practical.consultora_rrhh.modelo.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;
@Embeddable()
public class PuestoCompetenciaId implements Serializable {
    @Column(name="id_competencia")
    private Long idcompetencia;
     @Column(name="id_puesto")
    private Long idpuesto;

     public PuestoCompetenciaId() {}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PuestoCompetenciaId that = (PuestoCompetenciaId) o;
        return Objects.equals(idcompetencia, that.idcompetencia) && Objects.equals(idpuesto, that.idpuesto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcompetencia, idpuesto);
    }
}
