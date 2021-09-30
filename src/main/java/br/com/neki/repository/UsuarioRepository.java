package br.com.neki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.neki.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByLogin(String login);

}
