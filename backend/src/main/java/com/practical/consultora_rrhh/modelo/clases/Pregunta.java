package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.List;
/**
 *  Representa una pregunta dentro del sistema
 *
 * <p>Dispone de un atributo de eliminación lógica que permite
 * marcar el registro como eliminado sin borrarlo físicamente
 * de la base de datos. </p>
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
@Entity(name = "pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @ManyToOne()
    @JoinColumn(name = "id_factor", referencedColumnName = "codigo")
    private Factor factor;
@Column()
    private String nombre;
    @Column()
private String pregunta;
    @Column()
    private String descripcion;
    @Column()
    private Boolean eliminacion;
    @OneToMany(mappedBy = "pregunta")
     private List<OpcionRespuesta> opcionRespuestas;

}
