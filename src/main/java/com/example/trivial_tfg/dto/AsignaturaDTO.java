package com.example.trivial_tfg.dto;

import java.io.Serializable;

public class AsignaturaDTO implements Serializable {

	Long id_asignatura;
	Long id_curso;
	String nombre_asignatura;

	// CONSTRUCTORES

	public AsignaturaDTO() {
		super();
	}

	public AsignaturaDTO(Long id_asignatura, Long id_curso, String nombre_asignatura) {
		super();
		this.id_asignatura = id_asignatura;
		this.id_curso = id_curso;
		this.nombre_asignatura = nombre_asignatura;
	}

	// GETTERS Y SETTERS
	public Long getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public String getNombre_asignatura() {
		return nombre_asignatura;
	}

	public void setNombre_asignatura(String nombre_asignatura) {
		this.nombre_asignatura = nombre_asignatura;
	}

}
