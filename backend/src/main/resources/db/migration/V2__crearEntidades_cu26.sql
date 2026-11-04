CREATE TYPE tipo_competencia AS ENUM ('TECNICA', 'ACTITUDINAL', 'GENERICA');

CREATE TABLE competencia(
                            id  BIGINT GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,
                            codigo VARCHAR(30) NOT NULL UNIQUE,
                            nombre VARCHAR(30) NOT NULL  ,
                            descripcion VARCHAR(300),
                            tipo tipo_competencia NOT NULL
);
CREATE TABLE factor(
                       id  BIGINT GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,
                       codigo VARCHAR(30) NOT NULL UNIQUE,
                       nombre VARCHAR(30) NOT NULL  ,
                       descripcion VARCHAR(300),
                       eliminacion Bool NOT NULL DEFAULT  FALSE,
                       id_competencia BIGINT,
                       FOREIGN KEY (id_competencia) REFERENCES Competencia(id)
                           ON DELETE SET NULL,
                       Nro_orden SMALLINT
);


CREATE TABLE pregunta(
                         id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         id_factor BIGINT NOT NULL,
                         id_opcion_respuesta BIGINT,
                         FOREIGN KEY (id_factor) REFERENCES  factor(id),
                         FOREIGN KEY (id_opcion_respuesta) REFERENCES opcion_respuesta(id),
                         nombre      VARCHAR(30) NOT NULL ,
                         pregunta VARCHAR(70) NOT NULL,
                         descripcion VARCHAR(300),
                         eliminacion BOOLEAN NOT NULL  DEFAULT FALSE
);
CREATE TABLE ponderacion_opcion (
                                    id_pregunta BIGINT NOT NULL,
                                    id_opcion_respuesta BIGINT NOT NULL,
                                    fila SMALLINT NOT NULL,
                                    ponderacion INTEGER NOT NULL,

                                    PRIMARY KEY (id_pregunta,id_opcion_respuesta,fila),

                                    FOREIGN KEY (id_pregunta)        REFERENCES pregunta(id),
                                    FOREIGN KEY (id_pregunta, id_opcion_respuesta)
                                        REFERENCES pregunta(id, id_opcion_respuesta),
                                    CONSTRAINT uq_pregunta_opcion_respuesta
                                        UNIQUE (id, id_opcion_respuesta),

                                    FOREIGN KEY (id_opcion_respuesta, fila)
                                        REFERENCES opcion(id_opcion_respuesta, fila));

