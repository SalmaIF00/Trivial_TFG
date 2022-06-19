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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private String curso;

	// CURSO-ASIGNATURA
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Asignatura> asignaturas = new HashSet<>();

	// USUARIO-CURSO
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Usuario> usuario = new HashSet<>();

	// CONSTRUCTORES
	public Curso() {
		super();
	}

	// MÉTODO CONSTRUCTOR
	public Curso(Long id_curso, String curso, Set<Asignatura> asignaturas, Set<Usuario> usuario) {
		super();
		this.id_curso = id_curso;
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.usuario = usuario;
	}

	// GETTERS Y SETTERS
	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}

}
