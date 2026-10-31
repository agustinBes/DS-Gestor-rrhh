package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 *  Representa una posible opcion de respuesta para una pregunta
 *
 *
 * <p>Dado que el sistema utiliza cuestionarios de selección múltiple,
 * una misma opción puede estar asociada a distintas preguntas.
 * Esto permite reutilizar opciones de respuesta genéricas, como
 * "Sí", "No" o "Tal vez", almacenándolas una única vez en la base
 * de datos.</p>
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
@Table(name="opcion")
public class Opcion {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Nro;
@Column()
    private String nombre;
@Column()
private String descripcion;


}
