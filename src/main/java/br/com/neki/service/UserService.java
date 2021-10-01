package br.com.neki.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.model.User;
import br.com.neki.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public Optional<User> find (Long id) {
		return userRepository.findById(id);
	}
	
	public List<User> list () {
		return userRepository.findAll();
	}
	
	public User add (User user) {
		user = userRepository.save(user);
		return new User();
		
	}
	
	public User update (Long id, User user) {
		if (userRepository.existsById(id)) {
			user.setId(id);
			user = userRepository.save(user);
			return new User();
		} else {
			return null;
		}
	}
	
	public void delete (Long id) {
		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
		}
	}


}
