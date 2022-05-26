package com.example.trivial_tfg.dto;

import java.io.Serializable;

public class RespuestaDTO implements Serializable {

	Long id_respuesta;
	Long id_pregunta;
	String respuesta;

	// CONSTRUCTORES
	public RespuestaDTO() {
		super();
	}

	public RespuestaDTO(Long id_respuesta, Long id_pregunta, String respuesta) {
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

}
