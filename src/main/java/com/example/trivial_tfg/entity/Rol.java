package com.example.trivial_tfg.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol implements Serializable {
	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol")
	private Long id_rol;
	private String rol;

	// ROLES-UR-USUARIO
	@ManyToMany(mappedBy = "roles")
	private Set<Usuario> usuario = new HashSet<>();

	// CONSTRUCTORES

	public Rol() {
		super();
	}

	public Rol(Long id_rol, String rol) {
		super();
		this.id_rol = id_rol;
		this.rol = rol;
	}

	// GETTERS Y SETTERS
	public Long getId_rol() {
		return id_rol;
	}

	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}

	public void anadirUsuario(Usuario u) {

		u.getRoles().add(this);
		this.getUsuario().add(u);
	}

}