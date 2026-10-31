package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.TypeBinderType;
/**
 *  Representa una Puesto de trabajo al que van a aplicar los candidatos
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
@Table(name="puesto")
public class Puesto {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long codigo;
@Column()
private String nombre;
@Column()
private String descripcion;
@Column()
private String empresa;
}
