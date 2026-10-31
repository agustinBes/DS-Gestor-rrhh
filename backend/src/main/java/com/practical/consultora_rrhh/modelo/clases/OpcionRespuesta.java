package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.modelo.id.OpcionRespuestaId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 *  Representa la puntuacion o peso especifico de cada opcion para una pregunta
 *
 *
 * <p>Permite usar una opcion para distintas preguntas con diferente valoracion</p>
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
@Entity()
@Table(name="opcion_pregunta")
public class OpcionRespuesta {

    @EmbeddedId()
    private OpcionRespuestaId opcionRespuestaId;

    @MapsId("idPregunta")
    @ManyToOne()
    @JoinColumn(name = "id_pregunta",referencedColumnName = "id")
    private Pregunta pregunta;

        @MapsId("idOpcion")
        @ManyToOne()
        @JoinColumn(name="id_opcion",referencedColumnName = "Nro")
        private Opcion opcion;

    private short ponderacion;
}
