package com.example.trivial_tfg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
		@Query("from Usuario where nombre_usuario = :user")
		Usuario findByName(String user);
		
		@Query("from Usuario where nombre_usuario = :nom AND password = :pwd")
		Usuario findByUsernameAndPwd(String nom, String pwd);
		
		@Query("from Usuario where nombre_usuario = :nom")
		Usuario findByUsername(String nom);
}
