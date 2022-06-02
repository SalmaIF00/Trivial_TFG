package com.example.trivial_tfg.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Pregunta;
@Repository
public interface PreguntaRepository  extends JpaRepository<Pregunta, Long> {
	@Query("from Pregunta where id_asignatura = :idasignatura")
	Set<Pregunta> findByIdAsignatura(Long idasignatura);
}
