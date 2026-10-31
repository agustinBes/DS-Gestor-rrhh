
CREATE TYPE tipo_competencia AS ENUM ('TECNICA', 'ACTITUDINAL', 'GENERICA');

CREATE TABLE competencia(
        id  BIGINT GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,
        codigo VARCHAR(30) NOT NULL UNIQUE,
        nombre VARCHAR(30) NOT NULL UNIQUE ,
        descripcion VARCHAR(300),
        tipo tipo_competencia NOT NULL
);
CREATE TABLE factor(
        id  BIGINT GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,
        codigo VARCHAR(30) NOT NULL UNIQUE,
         nombre VARCHAR(30) NOT NULL UNIQUE ,
        descripcion VARCHAR(300),
        eliminacion Bool NOT NULL DEFAULT  FALSE,
        id_competencia BIGINT,
        FOREIGN KEY (id_competencia) REFERENCES Competencia(id)
        ON DELETE SET NULL,
        Nro_orden SMALLINT
);
CREATE TABLE opcion
(
    Nro         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre      VARCHAR(30) NOT NULL UNIQUE,
    descripcion VARCHAR(300)
);

CREATE TABLE pregunta(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    id_factor BIGINT NOT NULL,
  FOREIGN KEY (id_factor) REFERENCES  factor(id),
    nombre      VARCHAR(30) NOT NULL UNIQUE,
    pregunta VARCHAR(70) NOT NULL,
    descripcion VARCHAR(300),
    eliminacion BOOLEAN NOT NULL  DEFAULT FALSE
);
CREATE TABLE opcion_pregunta (
     id_pregunta BIGINT NOT NULL,
     id_opcion BIGINT NOT NULL,
     ponderacion SMALLINT NOT NULL ,
     PRIMARY KEY (id_pregunta, id_opcion),
     CONSTRAINT fk_pregunta FOREIGN KEY (id_pregunta) REFERENCES pregunta (id),
     CONSTRAINT fk_opcion FOREIGN KEY (id_opcion) REFERENCES opcion (Nro)
);
CREATE TABLE puesto(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    codigo VARCHAR(30) NOT NULL UNIQUE,
    nombre VARCHAR(30) NOT NULL UNIQUE,
    descripcion VARCHAR(300),
    empresa VARCHAR(50)
);
CREATE TABLE puesto_competencia(
    id_puesto BIGINT NOT NULL,
    id_competencia BIGINT NOT NULL,
    PRIMARY KEY (id_puesto,id_competencia),
    FOREIGN KEY (id_puesto) REFERENCES puesto(id),
    FOREIGN KEY (id_competencia) REFERENCES  competencia(id),
    ponderacion SMALLINT NOT NULL
);