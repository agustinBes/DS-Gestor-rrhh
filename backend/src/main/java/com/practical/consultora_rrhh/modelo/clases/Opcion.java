package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
 *@version 1.0
 *     Analizar si se requieren métodos específicos para modificar
 *         sus atributos, en lugar de utilizar setters directamente.
 *
 */
@Getter
@Setter
@NoArgsConstructor // Genera el constructor vacío
@AllArgsConstructor
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
