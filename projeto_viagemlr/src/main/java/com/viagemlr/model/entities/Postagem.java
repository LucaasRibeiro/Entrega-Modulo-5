package com.auth.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postagens")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postagem {
	
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	
}
