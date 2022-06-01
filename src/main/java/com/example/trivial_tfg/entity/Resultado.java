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
@Table(name = "resultado")
public class Resultado implements Serializable {
	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resultado")
	private Long id_resultado;
	private String resultado;

	//RESULTADO-USUARIO
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	// CONSTRUCTORES

	public Resultado() {
		super();

	}

	public Resultado(Long id_resultado, String resultado) {
		super();
		this.id_resultado = id_resultado;
		this.resultado = resultado;
	}

	// GETTERS Y SETTERS
	public Long getId_resultado() {
		return id_resultado;
	}

	public void setId_resultado(Long id_resultado) {
		this.id_resultado = id_resultado;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
