package com.example.trivial_tfg.dto;

import java.io.Serializable;

public class PreguntaDTO implements Serializable {

	Long id_pregunta;
	Long id_asignatura;
	String pregunta;

	// CONSTRUCTORES
	public PreguntaDTO() {
		super();
	}

	public PreguntaDTO(Long id_pregunta, Long id_asignatura, String pregunta) {
		super();
		this.id_pregunta = id_pregunta;
		this.id_asignatura = id_asignatura;
		this.pregunta = pregunta;
	}

	// GETTERS Y SETTERS
	public Long getId_pregunta() {
		return id_pregunta;
	}

	public void setId_pregunta(Long id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public Long getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

}
