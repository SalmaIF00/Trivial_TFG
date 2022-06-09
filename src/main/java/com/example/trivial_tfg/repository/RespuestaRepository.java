package com.example.trivial_tfg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Respuesta;
@Repository
public interface RespuestaRepository  extends JpaRepository<Respuesta, Long> {
	@Query("from Respuesta where id_pregunta = :idpregunta")
	List<Respuesta> findByIdPregunta(Long idpregunta);
}

