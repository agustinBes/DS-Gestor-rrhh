package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.dto.response.auditoriaDto;
import com.practical.consultora_rrhh.modelo.enums.tipoAuditoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Auditoria")
public class Auditoria {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
@Column(name = "Nombre_registro")
private String RegistroEliminado;
@Enumerated(EnumType.STRING)
private tipoAuditoria auditoria;
@Column(name = "fecha")
private LocalDateTime fecha;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_consultor")
private Consultor responsable;


public Auditoria(auditoriaDto dto){
    id=dto.id();
    RegistroEliminado=dto.registro();
    auditoria=tipoAuditoria.valueOf(dto.tipo());
    fecha=dto.fecha();
    responsable=new Consultor(dto.consultor());
}

}
