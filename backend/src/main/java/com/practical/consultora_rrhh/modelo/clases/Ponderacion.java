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

    @Column(name = "id_opcion_respuesta")
    private Long opcionRespuesta;

    @Column()
    private short fila;

    @Column(name="ponderacion")
    private Integer puntaje;
}
