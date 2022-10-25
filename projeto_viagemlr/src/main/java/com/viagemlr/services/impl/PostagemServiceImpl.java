package com.auth.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.model.entities.Postagem;
import com.auth.repositories.PostagemRepository;
import com.auth.services.PostagemService;

@Service
public class PostagemServiceImpl implements PostagemService {

	@Autowired
	PostagemRepository postRepository;
	
	@Override
	public List<Postagem> listAll() {
		return postRepository.findAll();
	}

}
