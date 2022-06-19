DROP DATABASE Trivial;
CREATE DATABASE Trivial;
USE Trivial;


CREATE TABLE rol (
id_rol BIGINT AUTO_INCREMENT NOT NULL,
rol varchar(255) DEFAULT NULL,
PRIMARY KEY(id_rol)
);



CREATE TABLE curso(
id_curso BIGINT NOT NULL AUTO_INCREMENT,
curso VARCHAR(100) NOT NULL,
PRIMARY KEY (id_curso)
);
CREATE TABLE usuario(
id_usuario BIGINT AUTO_INCREMENT NOT NULL,
id_curso BIGINT NOT NULL,
nombre VARCHAR(100) NOT NULL,
apellidos VARCHAR(100) NOT NULL,
nombre_usuario VARCHAR(100) NOT NULL,
password VARCHAR(100) NOT NULL,
rol VARCHAR(100) NOT NULL,
PRIMARY KEY(id_usuario),
CONSTRAINT FK3_idcurso FOREIGN KEY (id_curso) REFERENCES curso(id_curso)
);
CREATE TABLE usuario_rol(
id_usuario BIGINT NOT NULL,
id_rol BIGINT NOT NULL,
PRIMARY KEY (id_usuario,id_rol),
CONSTRAINT FK1_idusuario FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
CONSTRAINT FK2_idrol FOREIGN KEY (id_rol) REFERENCES rol (id_rol)
);
CREATE TABLE asignatura(
id_asignatura BIGINT NOT NULL AUTO_INCREMENT,
id_curso BIGINT NOT NULL,
nombre_asignatura VARCHAR(255) NOT NULL,
PRIMARY KEY (id_asignatura),
CONSTRAINT FK4_idcurso FOREIGN KEY (id_curso) REFERENCES curso (id_curso)
);

CREATE TABLE pregunta(
id_pregunta BIGINT NOT NULL AUTO_INCREMENT,
id_asignatura BIGINT NOT NULL,
pregunta VARCHAR(500) NOT NULL,
PRIMARY KEY (id_pregunta),
CONSTRAINT FK5_idasignatura FOREIGN KEY (id_asignatura) REFERENCES asignatura (id_asignatura)
);

CREATE TABLE respuesta(
id_respuesta BIGINT NOT NULL AUTO_INCREMENT,
id_pregunta BIGINT NOT NULL,
respuesta VARCHAR(500) NOT NULL,
resultado VARCHAR(500) NOT NULL,
PRIMARY KEY (id_respuesta),
CONSTRAINT FK6_idpregunta FOREIGN KEY (id_pregunta) REFERENCES pregunta (id_pregunta)
);

CREATE TABLE resultado(
id_resultado BIGINT NOT NULL AUTO_INCREMENT,
id_usuario BIGINT NOT NULL ,
resultado VARCHAR(500) NOT NULL,
PRIMARY KEY (id_resultado),
CONSTRAINT FK7_idusuario FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
);