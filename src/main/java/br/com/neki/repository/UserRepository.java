package br.com.neki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.neki.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public Optional<User> findByLogin(String login);

}
