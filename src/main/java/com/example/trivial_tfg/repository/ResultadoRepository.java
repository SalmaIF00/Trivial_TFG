package com.example.trivial_tfg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Resultado;
@Repository
public interface ResultadoRepository extends JpaRepository<Resultado, Long>{
	@Query("from Resultado where id_usuario = :idU")
	List<Resultado> findByUser(Long idU);
}
