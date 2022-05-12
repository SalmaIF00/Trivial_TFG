package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable {

	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta")
	private Long id_pregunta;
	private Long id_asignatura;
	private String pregunta;

	// CONSTRUCTORES
	public Pregunta() {
		super();
	}

	public Pregunta(Long id_pregunta, Long id_asignatura, String pregunta) {
		super();
		this.id_pregunta = id_pregunta;
		this.id_asignatura = id_asignatura;
		this.pregunta = pregunta;
	}

	// GETTERS Y SETTERS
	public Long getId_pregunta() {
		return id_pregunta;
	}

	public void setId_pregunta(Long id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public Long getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
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
