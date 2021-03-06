package com.example.trivial_tfg.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;

public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
	@Override
	    public void handle(HttpServletRequest request,
	                       HttpServletResponse response,
	                       AccessDeniedException ex) throws IOException, ServletException {

	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	        if (auth != null) {
	        }

	        response.sendRedirect(request.getContextPath() + "/access-denied");

	    }
}
