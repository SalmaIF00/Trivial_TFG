package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Pregunta;

@Repository
@Component("PreguntaDao")
public class PreguntaImpl extends DaoGenericoImpl<Pregunta> implements PreguntaDao{

}
