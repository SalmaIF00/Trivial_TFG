package com.example.trivial_tfg.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Resultado;

@Repository
@Component("ResultadoDao")
public class ResultadoImpl extends DaoGenericoImpl<Resultado> implements ResultadoDao {

}
