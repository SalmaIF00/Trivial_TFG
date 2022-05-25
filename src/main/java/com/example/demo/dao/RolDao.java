package com.example.demo.dao;

import com.example.demo.entity.Rol;

public interface RolDao extends DaoGenerico<Rol> {
	int saveUR(Long id_usuario, Long id_rol);
}
