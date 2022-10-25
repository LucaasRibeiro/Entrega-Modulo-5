package com.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.auth.model.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
	
	@Query("SELECT u FROM Usuarios u JOIN FETCH u.acessos WHERE u.username = :username")
	Usuario findByUsernameFetchAcessos(@Param("username")String username);
}
