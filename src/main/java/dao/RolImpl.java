package dao;

import javax.persistence.Query;

import entity.Rol;

public class RolImpl extends DaoGenericoImpl<Rol> implements RolDao {

	@Override
	public int saveUR(Long id_usuario, Long id_rol) {
		Query query = this.em.createQuery("INSERT INTO UR (id_usuario,id_rol) values(:user,:rol)");
		query.setParameter("user", id_usuario);
		query.setParameter("rol", id_rol);
		Integer ur = (Integer) query.getSingleResult();
		return ur;
	}
	
}
