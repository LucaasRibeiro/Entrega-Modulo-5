package com.auth.services;

import com.auth.model.entities.Usuario;

public interface UsuarioService <BCryptPasswordEnconder>{
	
	BCryptPasswordEnconder senhaEncoder();
	Usuario save(Usuario usuario);
}
