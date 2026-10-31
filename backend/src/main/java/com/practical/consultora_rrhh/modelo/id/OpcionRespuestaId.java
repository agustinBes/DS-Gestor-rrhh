package com.practical.consultora_rrhh.modelo.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable()
public class OpcionRespuestaId  implements Serializable {
  @Column(name="id_pregunta")
    private Long idPregunta;
  @Column(name="id_opcion")
    private Long idOpcion;

    public OpcionRespuestaId() {}

    public OpcionRespuestaId(Long Pregunta, Long Opcion) {
        this.idPregunta = Pregunta;
        this.idOpcion = Opcion;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpcionRespuestaId that = (OpcionRespuestaId) o;
        return Objects.equals(idPregunta, that.idPregunta) && Objects.equals(idOpcion, that.idOpcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPregunta, idOpcion);
    }
}