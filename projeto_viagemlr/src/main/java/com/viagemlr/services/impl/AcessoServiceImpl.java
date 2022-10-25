package com.auth.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.model.dto.UsuarioAcessoDTO;
import com.auth.model.entities.Acesso;
import com.auth.model.entities.Usuario;
import com.auth.repositories.UsuarioRepository;
import com.auth.services.AcessoService;

@Service
public class AcessoServiceImpl implements AcessoService {

	@Autowired
	UsuarioRepository userRepository;

	@Override
	public Usuario executar(UsuarioAcessoDTO usuarioAcessoDTO) {
		
		Optional<Usuario> usuarioExists = userRepository.findById(usuarioAcessoDTO.getIdUser());
		List<Acesso> acessos = new ArrayList<>();
		
		if (usuarioExists.isEmpty()) {
			throw new Error ("Usuario não encontrado!");
		}
		
		
		acessos = usuarioAcessoDTO.getIdsAcesso().stream().map(acesso -> 
		{
			return new Acesso(acesso);
		})collect(Collectors.toList());
		

		Usuario usuario = usuarioExists.get();
		
		usuario.setAcessos(acessos);
		
		userRepository.save(usuario);
		
		return usuario;
	}

}
