package com.example.trivial_tfg.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trivial_tfg.dao.RolDao;
import com.example.trivial_tfg.dao.UsuarioDao;
import com.example.trivial_tfg.entity.Usuario;

@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioDao usuarioDao;

	@Autowired
	private RolDao rolDao;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//	@Override
//	public List<Usuario> listarUsuario() {
//
//		return usuarioDao.findAll();
//	}

	@Override
	public Usuario buscarUsuarioId(Long id_usuario) {

		return usuarioDao.buscar(id_usuario);
	}

	@Override
	public Usuario buscarNomYPwd(String nombre, String pwd) {

		return usuarioDao.findByNameAndPass(nombre, pwd);
	}

	@Override
	public Usuario buscarNombreUsuario(String nombre_usuario) {

		return usuarioDao.findByUserName(nombre_usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return usuarioDao.actualizar(usuario);
	}

	@Override
	public void borrarUsuario(Long id_usuario) {
		usuarioDao.borrar(id_usuario);

	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void asignarRol(Long id_usuario, Long id_rol) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void asignarRol(Long id_usuario, Long id_rol) {
//		Usuario usuario1 = usuarioDao.buscar(id_usuario);
//		rolDao.saveUR(id_rol, usuario1.getId_usuario());
//	}
//
//	@Override
//	public Usuario crearUsuario(Long id_usuario, String nombre, String apellidos, String nombre_usuario,
//			String password, String rol) {
//		// ALMACENAR EL USUARIO
//		Usuario usuario1 = new Usuario(null, nombre, apellidos, nombre_usuario, bCryptPasswordEncoder.encode(password),
//				rol);
//
//		Rol rol_c = rolDao.buscar(2);
//		usuario1.anadirRol(rol_c);
//
//		return usuarioDao.crear(usuario1);
//	}


}
