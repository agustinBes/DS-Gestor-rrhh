package com.practical.consultora_rrhh.excepciones;

import com.practical.consultora_rrhh.excepciones.genericas.AtributoInvalidException;
import com.practical.consultora_rrhh.excepciones.genericas.DuplicatedException;
import com.practical.consultora_rrhh.excepciones.genericas.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**Controlador de excepciones globales de excepciones genericas para poder gestionar excepciones de multiples clases
 * aprovecha la generacion de excepciones especializadas que heredan de estas genericas
 *
 * @author  Besigniano Agustin
 * @since 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicatedException.class)
    public ResponseEntity<String> manejarDuplicado(
            DuplicatedException e) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(e.getMessage());
    }

    @ExceptionHandler(AtributoInvalidException.class)
    public ResponseEntity<String> manejarAtributoInvalido(AtributoInvalidException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<String> manejarObjectNotFound(ObjectNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(e.getMessage());
    }
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> manejarErrorTipo(
            MethodArgumentTypeMismatchException e) {

        return ResponseEntity.badRequest()
                .body("El parámetro '" + e.getName()
                        + "' no corresponde con el tipo de dato solicitado.");
    }
}