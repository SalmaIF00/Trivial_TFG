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
@Table(name = "pregunta")
public class Pregunta implements Serializable {

	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta")
	private Long id_pregunta;
	private String pregunta;

	
	//PREGUNTA-ASIGNATURA
	@ManyToOne
	@JoinColumn(name = "id_asignatura")
	private Asignatura asignatura;
	
	//PREGUNTA-RESPUESTA
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pregunta", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Respuesta> respuestas = new HashSet<>();

	
	// CONSTRUCTORES
	public Pregunta() {
		super();
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Pregunta(Long id_pregunta, String pregunta) {
		super();
		this.id_pregunta = id_pregunta;
		this.pregunta = pregunta;
	}

	// GETTERS Y SETTERS
	public Long getId_pregunta() {
		return id_pregunta;
	}
	

	public Set<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(Set<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public void setId_pregunta(Long id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
