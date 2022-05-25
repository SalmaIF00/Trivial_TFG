package com.example.demo.services;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;

@Transactional
@Service
public class CustomUserDetailsService {
//implements UserDetailsService{
//	
//	@Autowired
//	private UsuarioDao UsuarioDao;
//	@Override
//	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
//		Usuario usuario1 = UsuarioDao.findByUserName(usuario);
//
//		
//		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//		for (Rol rol : usuario1.getRoles()) {
//			grantedAuthorities.add(new SimpleGrantedAuthority(rol.getRol()));
//		}
//		return new org.springframework.security.core.userdetails.User(usuario1.getUsuario(), usuario1.getPwd(),
//				grantedAuthorities);
//	}
}