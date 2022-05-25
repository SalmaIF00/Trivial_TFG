package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Respuesta;

@Repository
@Component("RespuestaDao")
public class RespuestaImpl extends DaoGenericoImpl<Respuesta> implements RespuestaDao{

}
