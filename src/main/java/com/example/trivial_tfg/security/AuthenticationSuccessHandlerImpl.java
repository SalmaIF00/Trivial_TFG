package com.example.trivial_tfg.security;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.example.trivial_tfg.entity.Usuario;
import com.example.trivial_tfg.services.UsuarioService;

public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

	@Autowired
	private UsuarioService usuarioService;

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException {

		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		HttpSession session = request.getSession();
		Usuario authUser = usuarioService.buscarNombre(userDetails.getUsername());
		session.setAttribute("usuario", authUser);
		session.setAttribute("usuario.nombre", authUser.getNombre());
		session.setAttribute("usuario.id", authUser.getId_usuario());
		session.setAttribute("usuario.rol", authUser.getRol());

		boolean isUsuario = false;
		boolean isAdmin = false;
		boolean isProfe = false;
		final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (final GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("Alumno")) {
				isUsuario = true;
				session.setAttribute("usuario.rol", grantedAuthority.getAuthority().equals("Alumno"));
				break;
			} else if (grantedAuthority.getAuthority().equals("Administrador")) {
				isAdmin = true;
				session.setAttribute("usuario.rol", grantedAuthority.getAuthority().equals("Administrador"));
				break;
			} else if (grantedAuthority.getAuthority().equals("Profesor")){
				isProfe = true;
				session.setAttribute("usuario.rol", grantedAuthority.getAuthority().equals("Profesor"));
				break;
			}
		}

		String targetUrl;
		if (isUsuario || isProfe) {
			targetUrl = "/perfil";
		} else if (isAdmin) {
			targetUrl = "/index";
		} else {
			throw new IllegalStateException();
		}

		redirectStrategy.sendRedirect(request, response, targetUrl);
	}

	public void setRedirectStrategy(final RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	protected RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

    

}
