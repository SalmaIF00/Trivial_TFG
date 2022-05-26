package com.example.trivial_tfg.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

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