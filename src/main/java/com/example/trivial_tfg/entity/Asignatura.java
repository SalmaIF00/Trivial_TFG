package com.example.trivial_tfg.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "asignatura")
public class Asignatura implements Serializable {

	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_asignatura")
	private Long id_asignatura;
	private Long id_curso;
	private String nombre_asignatura;

	//ASIGNATURAS-CURSO
	@ManyToOne
	@JoinColumn(name = "id_curso")
	private Curso curso;

	//ASIGNATURA-PREGUNTA
	@OneToMany(mappedBy = "asignatura",cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Pregunta> pregunta = new HashSet<>();
	
	// CONSTRUCTORES
	public Asignatura() {
		super();
	}

	public Asignatura(Long id_asignatura, Long id_curso, String nombre_asignatura) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
