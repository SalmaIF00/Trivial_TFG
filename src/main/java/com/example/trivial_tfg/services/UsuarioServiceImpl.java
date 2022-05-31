package com.example.trivial_tfg.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.entity.Rol;
import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.repository.RolRepository;
import com.example.trivial_tfg.repository.UsuarioRepository;

@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private RolRepository rolRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<Usuario> listarUsuario() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario buscarUsuarioId(Long id_usuario) {
		return usuarioRepository.getById(id_usuario);
	}

	@Override
	public Usuario buscarNomYPwd(String nombre_usuario, String pwd) {
		return usuarioRepository.findByUsernameAndPwd(nombre_usuario, pwd);
	}
	
	@Override
	public Usuario buscarNombre(String nombre) {
		return usuarioRepository.findByName(nombre);
	}

	@Override
	public Usuario crearUsuario(Long id_usuario, String nombre, String apellidos, String nombre_usuario,
			String password, String rol) {
		// ALMACENAR EL USUARIO
		Usuario usuario1 = new Usuario(null, nombre, apellidos, nombre_usuario, bCryptPasswordEncoder.encode(password), rol);

		Rol rol_c = rolRepository.findById(2);
		usuario1.anadirRol(rol_c);

		return usuarioRepository.save(usuario1);
	}

//	@Override
//	public Usuario buscarNombreUsuario(String nombre_usuario) {
//
//		return usuarioRepository.findByUserName(nombre_usuario);
//	}
//
//	@Override
//	public Usuario actualizarUsuario(Usuario usuario) {
//		return usuarioRepository.save(usuario);
//	}
//
//	@Override
//	public void borrarUsuario(Long id_usuario) {
//		usuarioRepository.deleteById(id_usuario);
//
//	}
//
//
//
//	@Override
//	public void asignarRol(Long id_usuario, Long id_rol) {
//		Usuario usuario1 = usuarioRepository.buscar(id_usuario);
//		rolRepository.saveUR(id_rol, usuario1.getId_usuario());
//	}

}
