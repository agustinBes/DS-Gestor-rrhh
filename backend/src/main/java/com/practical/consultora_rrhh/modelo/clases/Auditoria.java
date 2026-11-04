package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.modelo.enums.tipoAuditoria;
import com.practical.consultora_rrhh.objectTransfer.dto.auditoriaDto;
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
//Oculto hasta implementar la clase del consultor
//private Consultor responsable;

/*
public Auditoria(auditoriaDto a){
    id=a.Nro().longValue();
    RegistroEliminado=a.nombre();
    auditoria=tipoAuditoria.valueOf(a.tipo());
    fecha=LocalDateTime.now();
responsable=new Consultor(a.consultor());
}*/

}
