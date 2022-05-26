package com.example.trivial_tfg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByNameAndPass(String nombre, String pwd);

//	List<Usuario> findAll();

	Integer findId();

	Usuario findByUserName(String usuario);
}
