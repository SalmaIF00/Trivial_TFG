package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Asignatura;

@Repository
@Component("AsignaturaDao")
public class AsignaturaImpl extends DaoGenericoImpl<Asignatura> implements AsignaturaDao{

}
