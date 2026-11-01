package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.modelo.id.PuestoCompetenciaId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *  Representa la relacion de "muchos a muchos" que puede tener un puesto con una competencia
 *
 *
 * @author Besigniano Agustin
 * @since 1.0
 *@version 1.0
*       Analizar si se requieren métodos específicos para modificar
 *         sus atributos, en lugar de utilizar setters directamente.
 */
@Getter
@Setter
@NoArgsConstructor // Genera el constructor vacío
@AllArgsConstructor
@Entity
@Table(name="puesto_competencia")
public class PuestoCompetencia {
    @EmbeddedId()
private PuestoCompetenciaId id;
    @MapsId("idpuesto")
    @ManyToOne()
    @JoinColumn(name="id_puesto",referencedColumnName = "id")
    private Puesto puesto;
    @MapsId("idcompetencia")
    @ManyToOne()
    @JoinColumn(name="id_competencia",referencedColumnName = "id")
    private Competencia competencia;
    @Column()
    private short ponderacion;
}
