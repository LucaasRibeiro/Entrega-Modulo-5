package com.auth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@Component
public class SecurityConfig{
	
	
	private final UsuarioDetailsService usuarioDetailsService;
	public SecurityConfig(UsuarioDetailsService usuarioDetailsService) {
		this.usuarioDetailsService = usuarioDetailsService;
	}
	
	
	@Bean
	PasswordEncoder passowordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)  throws Exception {
		return http.csrf().and().cors().disable().authorizeHttpRequests(auth -> 
		auth.antMatchers("/","/home","usuario/create")
			.permitAll()
			.antMatchers("/usuario/acesso")
			.permitAll()
			.anyRequest()				
			.authenticated())
			.userDetailsService(usuarioDetailsService)
			.headers(headers -> headers.frameOptions().sameOrigin())
			.httpBasic(Customizer
			.withDefaults())
			.build();
	}
	
}
