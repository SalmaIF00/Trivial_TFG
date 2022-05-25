package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Curso;

@Repository
@Component("CursoDao")
public class CursoImpl extends DaoGenericoImpl<Curso> implements CursoDao {

}
