package com.practical.consultora_rrhh.modelo.clases;

import com.practical.consultora_rrhh.dto.request.opcionDtoCreate;
import com.practical.consultora_rrhh.dto.response.opcionDto;
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
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/*
* clase cuyos atributos se almacenarán directamente dentro de la tabla de la entidad que la contiene,
*  sin necesidad de crear una tabla independiente para ella
* */
public class Opcion {
    @Transient
    private Long idOpcionRespuesta;
    @Column()
    private short fila;
    @Column()
    private short orden;
      @Column()
    private String descripcion;


public  Opcion(opcionDtoCreate x){
    fila=x.fila();
    idOpcionRespuesta=null;
    orden=x.orden();
    descripcion=x.descripcion();

}
    public  Opcion(opcionDto x){
    fila=x.fila();
        idOpcionRespuesta= x.id();
        orden=x.orden();
        descripcion=x.descripcion();

    }


}
