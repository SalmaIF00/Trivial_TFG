package com.example.trivial_tfg.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Usuario;

@Repository
@Component("UsuarioDao")
public class UsuarioImpl extends DaoGenericoImpl<Usuario> implements UsuarioDao{

	@Override
	public Usuario findByNameAndPass(String nombre, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Usuario> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Integer findId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByUserName(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Usuario findByNameAndPass(String usuario, String pwd) {
//		Query query = this.em.createQuery("from Usuario where usuario LIKE :user and pwd = :pass ");
//		query.setParameter("user", usuario);
//		query.setParameter("pass", pwd);
//		return (Usuario) query.getSingleResult();
//	}
//
//	@Override
//	public Integer findId() {
//		Query query = this.em.createQuery("SELECT id_usuario FROM Usuario ORDER BY id_usuario DESC LIMIT 1;");
//		Integer idusuario = (Integer) query.getSingleResult();
//		return idusuario;
//	}
//
//	@Override
//	public List<Usuario> findAll() {
//		Query query = this.em.createQuery("from Usuario");
//		List<Usuario> lusuario = query.getResultList();
//		return lusuario;
//	}
//
//	@Override
//	public Usuario findByUserName(String usuario) {
//		Query query = this.em.createQuery("from Usuario where usuario LIKE :user ");
//		query.setParameter("user", usuario);
//		return (Usuario) query.getSingleResult();
//	}

}
