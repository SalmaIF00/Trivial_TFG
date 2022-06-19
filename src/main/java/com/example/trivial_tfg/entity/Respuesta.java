package com.example.trivial_tfg.entity;


import java.io.Serializable;
import java.util.Set;

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
	private String respuesta;
	private String resultado;

	// RESPUESTA- PREGUNTA
	@ManyToOne
	@JoinColumn(name = "id_pregunta")
	private Pregunta pregunta;

	// CONSTRUCTORES
	public Respuesta() {
		super();
	}

	public Respuesta(Long id_respuesta, String respuesta, String resultado, Pregunta pregunta) {
		super();
		this.id_respuesta = id_respuesta;
		this.respuesta = respuesta;
		this.resultado = resultado;
		this.pregunta = pregunta;
	}

	// GETTERS Y SETTERS
	public Long getId_respuesta() {
		return id_respuesta;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public void setId_respuesta(Long id_respuesta) {
		this.id_respuesta = id_respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
