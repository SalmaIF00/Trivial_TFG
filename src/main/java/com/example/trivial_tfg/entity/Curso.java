package com.example.trivial_tfg.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private Long id_curso;
	private Long id_usuario;
	private String curso;

	//CURSO-ASIGNATURA
		@OneToMany(fetch = FetchType.EAGER, mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
		private Set<Asignatura> asignaturas = new HashSet<>();

		//CURSO-USUARIOS
		@OneToMany(fetch = FetchType.EAGER, mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
		private Set<Usuario> usuarios = new HashSet<>();

	//RESULTADO- USUARIO
		
		
	// CONSTRUCTORES
	public Curso() {
		super();
	}

	public Curso(Long id_curso, Long id_usuario, String curso) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
