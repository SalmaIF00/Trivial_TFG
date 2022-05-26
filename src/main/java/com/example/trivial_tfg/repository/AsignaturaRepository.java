package com.example.trivial_tfg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Asignatura;
@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long>{

}
