package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
@Table(name="opcion_respuesta")
public class OpcionRespuesta {

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column()
 private Long id;
 @Column()
 private String nombre;
 @Column()
 private String descripcion;
 /*
 * @ElementCollection: indica que es una colección de objetos embebidos.
@CollectionTable: establece la tabla donde se almacenan.
@JoinColumn: indica la FK hacia opcion_respuesta.
@OrderColumn: indica la columna que almacena la posición de cada elemento de la lista.
 * */
    @ElementCollection
    @CollectionTable(name = "opcion",joinColumns = @JoinColumn(name = "id_opcion_respuesta"))
    private List<Opcion> opciones = new ArrayList<>();
}
