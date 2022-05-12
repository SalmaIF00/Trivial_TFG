package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import services.CustomUserDetailsService;

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
                    .antMatchers(
                            "/","/index", 
                            "/css/**",
                            "/img/**",
                            "/sesion",
                           " /producto/{id_producto}",
                           "/js/**",
                            "/registro").permitAll()
                    .antMatchers("/crear").hasAuthority("Administrador")
                    .antMatchers("/{/borrar/{id}").hasAuthority("Administrador")
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/sesion")
                    .loginProcessingUrl("/sesion")
                    .usernameParameter("usuario")
                    .passwordParameter("pwd")
                    .successHandler(myAuthenticationSuccessHandler())
                    .permitAll()
                .and()
                .logout()
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID")
                    .clearAuthentication(true)
                    .logoutUrl("/logout")
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .logoutSuccessUrl("/sesion?logout")
                    .permitAll();
                http.csrf().ignoringAntMatchers("/img/**");
    }
    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
// 
//        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());     
//    }
    
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