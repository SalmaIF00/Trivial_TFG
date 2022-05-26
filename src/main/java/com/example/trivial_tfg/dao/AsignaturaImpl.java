package com.example.trivial_tfg.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.trivial_tfg.entity.Asignatura;

@Repository
@Component("AsignaturaDao")
public class AsignaturaImpl extends DaoGenericoImpl<Asignatura> implements AsignaturaDao{

}
