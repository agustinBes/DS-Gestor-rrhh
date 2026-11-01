package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.modelo.id.OpcionRespuestaId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *  Representa la puntuacion o peso especifico de cada opcion para una pregunta
 *
 *
 * <p>Permite usar una opcion para distintas preguntas con diferente valoracion</p>
 *
 * @author Besigniano Agustin
 * @since 1.0
 *@version 1.0
**
*       Analizar si se requieren métodos específicos para modificar
 *         sus atributos, en lugar de utilizar setters directamente.
 */
@Getter
@Setter
@NoArgsConstructor // Genera el constructor vacío
@AllArgsConstructor
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
