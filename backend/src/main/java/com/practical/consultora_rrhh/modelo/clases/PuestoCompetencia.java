package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.modelo.id.PuestoCompetenciaId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 *  Representa la relacion de "muchos a muchos" que puede tener un puesto con una competencia
 *
 *
 * @author Besigniano Agustin
 * @since 1.0
 *
 * <h3>Mejoras y cuestiones pendientes</h3>
 * <ul>
 *     <li>Evaluar la implementación de un constructor que permita
 *         inicializar la entidad a partir de un DTO.</li>
 *     <li>Analizar si se requieren métodos específicos para modificar
 *         sus atributos, en lugar de utilizar setters directamente.</li>
 *   </ul>
 */
@Getter
@Setter
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
