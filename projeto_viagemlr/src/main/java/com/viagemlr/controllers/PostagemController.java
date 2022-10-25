package com.auth.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.entities.Postagem;
import com.auth.services.PostagemService;

@RestController
@RequestMapping("/post")
public class PostagemController {

	@Autowired
	PostagemService postagemService;
	
	@GetMapping
	public List<Postagem> list(){
		return postagemService.listAll();
	}
	
}
