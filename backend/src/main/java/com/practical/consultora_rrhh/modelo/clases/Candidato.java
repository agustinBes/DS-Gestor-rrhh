package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.dto.response.candidatoDto;
import com.practical.consultora_rrhh.modelo.enums.tipoDocumento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidato")
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_candidato")
    private Long id;
    private String clave;
    @Column(name="fecha_nacimiento")
private LocalDateTime fecha;
    private String nombre;
    private String apellido;
    private String mail;
    @Enumerated(EnumType.STRING)
    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    @Column(name = "tipo_documento", columnDefinition = "tipo_documento")
    private tipoDocumento tipo;
    private String documento;
    private String nacionalidad;
    private char genero;
    private String escolaridad;


public Candidato(candidatoDto x){
    id=x.id();
    clave=null;
    fecha=x.fecha();
    nombre=x.nombre();
    apellido=x.apellido();
    mail=x.mail();
    tipo=tipoDocumento.desdeString(x.tipo());
    documento=x.documento();
    nacionalidad=x.nacionalidad();
    genero=x.genero();
    escolaridad=x.escolaridad();
}


}
