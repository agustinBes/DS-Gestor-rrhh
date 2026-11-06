package com.practical.consultora_rrhh.modelo.clases;

<<<<<<< HEAD
import com.practical.consultora_rrhh.dto.response.usuarioDto;
=======
>>>>>>> 68fe2f3 (recuperando cambios de modelos, DTO y gestores)
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "consultor")
<<<<<<< HEAD
public class Consultor extends Usuario {
private short nivelAcceso;


public Consultor(usuarioDto x){
super(x.id(),x.nombre(),null);
    nivelAcceso=2;


}

}
=======
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
>>>>>>> 68fe2f3 (recuperando cambios de modelos, DTO y gestores)
