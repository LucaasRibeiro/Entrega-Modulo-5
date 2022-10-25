package com.auth.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Olá";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String user() {
		return "Olá Usuario";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/home")
	public String admin() {
		return "Olá Admin";
	}
}
