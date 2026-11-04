package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
 *@version 1.0
 *     Analizar si se requieren métodos específicos para modificar
 *         sus atributos, en lugar de utilizar setters directamente.
 *
 */
@Getter
@Setter
@NoArgsConstructor // Genera el constructor vacío
@AllArgsConstructor
@Entity(name = "pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @ManyToOne()
    @JoinColumn(name = "id_factor", referencedColumnName = "id")
    private Factor factor;
@Column()
    private String nombre;
    @Column()
private String pregunta;
    @Column()
    private String descripcion;
    @Column()
    private Boolean eliminacion;
    @ManyToOne()
    @JoinColumn(name = "id_opcion_respuesta",referencedColumnName="id")
    private OpcionRespuesta opcionRespuesta;
    @ElementCollection
    @CollectionTable(
name = "Ponderacion_Opcion",joinColumns = @JoinColumn(name = "id_pregunta",referencedColumnName = "id"))

    List<Ponderacion> ponderaciones;

}
