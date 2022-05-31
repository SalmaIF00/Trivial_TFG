package com.example.trivial_tfg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
//	int saveUR(Long id_usuario, Long id_rol);
	
	@Query("from Rol where id_rol = :id")
	Rol findById(int i);
}
