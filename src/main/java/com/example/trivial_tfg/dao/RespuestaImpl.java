package com.example.trivial_tfg.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Respuesta;

@Repository
@Component("RespuestaDao")
public class RespuestaImpl extends DaoGenericoImpl<Respuesta> implements RespuestaDao{

}
