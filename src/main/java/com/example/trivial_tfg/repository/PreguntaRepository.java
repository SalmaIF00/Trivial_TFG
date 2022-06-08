package com.example.trivial_tfg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Pregunta;
@Repository
public interface PreguntaRepository  extends JpaRepository<Pregunta, Long> {
	@Query("from Pregunta where id_asignatura = :idasignatura")
	List<Pregunta> findByIdAsignatura(Long idasignatura);
}
