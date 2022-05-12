package dto;

import java.io.Serializable;


public class ResultadoDTO implements Serializable {
	
	 Long id_resultado;
	 Long id_usuario;
	 String resultado;

	// CONSTRUCTORES

	public ResultadoDTO() {
		super();

	}

	public ResultadoDTO(Long id_resultado, Long id_usuario, String resultado) {
		super();
		this.id_resultado = id_resultado;
		this.id_usuario = id_usuario;
		this.resultado = resultado;
	}

	// GETTERS Y SETTERS
	public Long getId_resultado() {
		return id_resultado;
	}

	public void setId_resultado(Long id_resultado) {
		this.id_resultado = id_resultado;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}


}
