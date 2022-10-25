package com.auth.services;

import com.auth.model.dto.UsuarioAcessoDTO;
import com.auth.model.entities.Usuario;

public interface AcessoService {
	
	Usuario executar (UsuarioAcessoDTO usuarioAcessoDTO);
}
