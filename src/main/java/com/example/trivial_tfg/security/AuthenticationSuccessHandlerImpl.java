package com.example.trivial_tfg.security;
//package com.example.demo.security;
//
//import java.io.IOException;
//import java.util.Collection;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
//
//	@Autowired
//	//private UsuarioService usuarioService;
//
//	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//			Authentication authentication) throws IOException {
//
//		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//		HttpSession session = request.getSession();
////		Usuario authUser = usuarioService.buscarNombre(userDetails.getUsername());
////		session.setAttribute("usuario", authUser);
////		session.setAttribute("usuario.nombre", authUser.getNombre());
////		session.setAttribute("usuario.id", authUser.getId());
//
//		boolean isUsuario = false;
//		boolean isAdmin = false;
//		final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
//		for (final GrantedAuthority grantedAuthority : authorities) {
//			if (grantedAuthority.getAuthority().equals("UsuarioR")) {
//				isUsuario = true;
//				session.setAttribute("usuario.rol", grantedAuthority.getAuthority().equals("UsuarioR"));
//				break;
//			} else if (grantedAuthority.getAuthority().equals("Administrador")) {
//				isAdmin = true;
//				session.setAttribute("usuario.rol", grantedAuthority.getAuthority().equals("Administrador"));
//				break;
//			}
//		}
//
//		String targetUrl;
//		if (isUsuario) {
//			targetUrl = "/index";
//		} else if (isAdmin) {
//			targetUrl = "/crear";
//		} else {
//			throw new IllegalStateException();
//		}
//
//		redirectStrategy.sendRedirect(request, response, targetUrl);
//	}
//
//	public void setRedirectStrategy(final RedirectStrategy redirectStrategy) {
//		this.redirectStrategy = redirectStrategy;
//	}
//
//	protected RedirectStrategy getRedirectStrategy() {
//		return redirectStrategy;
//	}
//
//    
//
//}
