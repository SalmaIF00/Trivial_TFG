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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = -8668594760203621162L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id_usuario;

	private String nombre;
	private String apellidos;
	private String nombre_usuario;
	private String password;
	private String rol;

	// USUARIOS-UR-ROLES
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private Set<Rol> roles = new HashSet<>();

	// CURSO-USUARIOS
	@ManyToOne
	@JoinColumn(name = "id_curso")
	private Curso curso;

	// USUARIO-RESULTADO
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Resultado> resultado = new HashSet<>();

	// MÉTODO CONSTRUCTOR VACÍO
	public Usuario() {
		super();
	}
	
	//MÉTODO CONSTRUCTOR PARA GUARDAR USUARIO
	public Usuario(Long id_usuario, Curso curso, String nombre, String apellidos, String nombre_usuario, String password, String rol) {
		super();
		this.id_usuario = id_usuario;
		this.curso = curso;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombre_usuario = nombre_usuario;
		this.password = password;
		this.rol = rol;
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS
	public Usuario(Long id_usuario, String nombre, String apellidos, String nombre_usuario, String password, String rol,
			Set<Rol> roles, Curso curso, Set<Resultado> resultado) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombre_usuario = nombre_usuario;
		this.password = password;
		this.rol = rol;
		this.roles = roles;
		this.curso = curso;
		this.resultado = resultado;
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

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Set<Resultado> getResultado() {
		return resultado;
	}

	public void setResultado(Set<Resultado> resultado) {
		this.resultado = resultado;
	}

	public void anadirRol(Rol rol) {

		rol.getUsuario().add(this);

		this.getRoles().add(rol);
	}
}