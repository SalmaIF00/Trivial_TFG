package com.example.trivial_tfg.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Pregunta;

@Repository
@Component("PreguntaDao")
public class PreguntaImpl extends DaoGenericoImpl<Pregunta> implements PreguntaDao{

}
