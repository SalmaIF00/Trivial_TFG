package com.example.trivial_tfg.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

	Long id_usuario;

	String nombre;
	String apellidos;
	String nombre_usuario;
	String password;
	String rol;

	// CONSTRUCTORES
	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Long id_usuario, String nombre, String apellidos, String nombre_usuario, String password,
			String rol) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombre_usuario = nombre_usuario;
		this.password = password;
		this.rol = rol;
	}

	// GETTERS Y SETTERS
	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}