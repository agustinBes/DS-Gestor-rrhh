package com.practical.consultora_rrhh.modelo.clases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "consultor")
public class Consultor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_usuario")
    private String nombre;
    private String clave;
    @Column(name="nivel_acceso")
private short nivelAcceso;




}
