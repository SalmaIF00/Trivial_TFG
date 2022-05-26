package com.example.trivial_tfg.dto;

import java.io.Serializable;

public class RolDTO implements Serializable {

	Long id_rol;
	String rol;

	// CONSTRUCTORES

	public RolDTO() {
		super();
	}

	public RolDTO(Long id_rol, String rol) {
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

}