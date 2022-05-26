package com.example.trivial_tfg.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Curso;

@Repository
@Component("CursoDao")
public class CursoImpl extends DaoGenericoImpl<Curso> implements CursoDao {

}
