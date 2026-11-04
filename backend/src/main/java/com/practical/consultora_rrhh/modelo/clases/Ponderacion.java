package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable()
public class Ponderacion{
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_opcion_respuesta", referencedColumnName = "id_opcion_respuesta"),
            @JoinColumn(name = "fila", referencedColumnName = "fila")
    })
    private Opcion opcion;

    @Column(name="ponderacion")
    private Integer puntaje;
}
