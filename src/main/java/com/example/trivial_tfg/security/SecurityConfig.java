package com.example.trivial_tfg.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.trivial_tfg.services.CustomUserDetailsService;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled=true)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	@Override
  protected void configure(HttpSecurity http) throws Exception {
      http
              .authorizeRequests()
                  .antMatchers( "/","/index", 
                          "/css/**",
                          "/js/**",
                          "/img/**",
                          "/asignaturas",
                          "/registro",
                          "/navbar",
                          "/perfil",
                          "/sesion",
                          "/preguntas_opciones",
                          "/preguntas_tf",
                          "/ranking",
                          "/ruleta").permitAll()
                  .anyRequest().authenticated()
              .and()
              .formLogin()
                  .loginPage("/index")
                  .loginProcessingUrl("/sesion")
                  .usernameParameter("nombre_usuario")
                  .passwordParameter("password")
                  .successHandler(myAuthenticationSuccessHandler())
                  .permitAll()
              .and()
              .logout()
                  .invalidateHttpSession(true)
                  .deleteCookies("JSESSIONID")
                  .clearAuthentication(true)
                  .logoutSuccessUrl("/sesion?logout")
                  .permitAll();
              http.csrf().ignoringAntMatchers("/img/**");
  }
      
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
  @Bean
  public AuthenticationSuccessHandlerImpl myAuthenticationSuccessHandler(){
      return new AuthenticationSuccessHandlerImpl();
  }

}