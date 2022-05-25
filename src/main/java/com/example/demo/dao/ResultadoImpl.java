package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Resultado;

@Repository
@Component("ResultadoDao")
public class ResultadoImpl extends DaoGenericoImpl<Resultado> implements ResultadoDao {

}
