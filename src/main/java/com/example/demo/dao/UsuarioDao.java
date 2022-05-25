package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Usuario;

public interface UsuarioDao extends DaoGenerico<Usuario> {
	Usuario findByNameAndPass(String nombre, String pwd);

	List<Usuario> findAll();

	Integer findId();

	Usuario findByUserName(String usuario);
}
