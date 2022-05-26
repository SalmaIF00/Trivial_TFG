package com.example.trivial_tfg.dto;

import java.io.Serializable;

public class CursoDTO implements Serializable {

	Long id_curso;
	Long id_usuario;
	String curso;

	// CONSTRUCTORES
	public CursoDTO() {
		super();
	}

	public CursoDTO(Long id_curso, Long id_usuario, String curso) {
		super();
		this.id_curso = id_curso;
		this.id_usuario = id_usuario;
		this.curso = curso;
	}
	// GETTERS Y SETTERS

	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
