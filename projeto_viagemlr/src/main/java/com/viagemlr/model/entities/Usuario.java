package com.auth.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	
	private String username;
	
	private String senha;
	
	@ManyToMany
	private List <Acesso> acessos;
}