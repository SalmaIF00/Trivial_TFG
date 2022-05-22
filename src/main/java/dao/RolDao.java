package dao;

import entity.Rol;

public interface RolDao extends DaoGenerico<Rol> {
	int saveUR(Long id_usuario, Long id_rol);
}
