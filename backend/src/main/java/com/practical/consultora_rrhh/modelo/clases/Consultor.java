package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.dto.response.usuarioDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "consultor")
public class Consultor extends Usuario {
private short nivelAcceso;


public Consultor(usuarioDto x){
super(x.id(),x.nombre(),null);
    nivelAcceso=2;


}

}
