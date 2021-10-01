package br.com.neki.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.neki.model.User;
import br.com.neki.model.UserSecurity;
import br.com.neki.repository.UserRepository;

@Service
public class UserSecurityService implements UserDetailsService {

	@Autowired
	private UserRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User usuario;
		try {
			Optional<User> opUsuario = usuarioRepository.findByLogin(username);
			if (!opUsuario.isPresent())
				throw new UsernameNotFoundException("Usuário não encontrado");
			else {
				usuario = opUsuario.get();
			}
		} catch (Exception e) {
			throw new UsernameNotFoundException("database error");
		}
		UserSecurity springUser = buildUserFromUserEntity(usuario);
		return springUser;

	}

	@SuppressWarnings("unchecked")
	private UserSecurity buildUserFromUserEntity(User userEntity) {
		String username = userEntity.getLogin().toString();
		String password = userEntity.getPassword();

		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		boolean enable = true;

		String[] userRoles = { "admin" };
		AuthorityUtils.createAuthorityList(userRoles);

		Collection<? extends GrantedAuthority> authorities = (Collection<? extends GrantedAuthority>) AuthorityUtils
				.createAuthorityList(userRoles);

		UserSecurity springUser = new UserSecurity(username, password, enable, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);

		return springUser;

	}

}
