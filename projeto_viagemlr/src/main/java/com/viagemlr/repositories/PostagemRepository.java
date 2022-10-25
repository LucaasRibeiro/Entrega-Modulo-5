package com.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.model.entities.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
}
