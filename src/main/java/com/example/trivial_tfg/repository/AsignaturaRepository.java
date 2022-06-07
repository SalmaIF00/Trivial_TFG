package com.example.trivial_tfg.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Asignatura;
@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long>{
	@Query("from Asignatura where id_curso = :idcurso")
	Set<Asignatura> findByIdCurso(Long idcurso);
}
