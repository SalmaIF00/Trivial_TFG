package com.example.trivial_tfg.services;

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

import com.example.trivial_tfg.entity.Rol;
import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.repository.UsuarioRepository;

@Transactional
@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
		Usuario usuario1 = usuarioRepository.findByName(usuario);
		
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		for (Rol rol : usuario1.getRoles()) {
			grantedAuthorities.add(new SimpleGrantedAuthority(rol.getRol()));
		}
		return new org.springframework.security.core.userdetails.User(usuario1.getNombre_usuario(), usuario1.getPassword(),
				grantedAuthorities);
	}
}