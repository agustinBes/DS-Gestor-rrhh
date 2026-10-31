package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.modelo.enums.tipoCompetencia;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcType;
import org.hibernate.dialect.type.PostgreSQLEnumJdbcType;

import java.util.List;
/**
 * Representa una cualidad a evaluar cuando se aplica a un puesto de trabajo

 * @author Besigniano Agustin
 * @since 1.0
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
@Table(name = "competencia")
public class Competencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String codigo;
    @Column(length = 30)
    private String nombre;
    @Column(length = 300)
    private String descripcion;
@OneToMany(mappedBy = "competencia")
    private List<Factor> factores;
    @JdbcType(PostgreSQLEnumJdbcType.class)
    @Column(name = "tipo")
    private tipoCompetencia tipoCompetencia;
}
