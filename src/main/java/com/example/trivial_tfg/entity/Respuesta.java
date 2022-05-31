package com.example.trivial_tfg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "respuesta")
public class Respuesta implements Serializable {

	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_respuesta")
	private Long id_respuesta;
	private Long id_pregunta;
	private String respuesta;

	//RESPUESTA- PREGUNTA
	@ManyToOne
	@JoinColumn(name = "id_pregunta")
	private Pregunta pregunta;
	
	// CONSTRUCTORES
	public Respuesta() {
		super();
	}

	public Respuesta(Long id_respuesta, Long id_pregunta, String respuesta) {
		super();
		this.id_respuesta = id_respuesta;
		this.id_pregunta = id_pregunta;
		this.respuesta = respuesta;
	}

	// GETTERS Y SETTERS
	public Long getId_respuesta() {
		return id_respuesta;
	}

	public void setId_respuesta(Long id_respuesta) {
		this.id_respuesta = id_respuesta;
	}

	public Long getId_pregunta() {
		return id_pregunta;
	}

	public void setId_pregunta(Long id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
