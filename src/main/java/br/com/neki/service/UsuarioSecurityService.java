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

import br.com.neki.model.Usuario;
import br.com.neki.model.UsuarioSecurity;
import br.com.neki.repository.UsuarioRepository;

@Service
public class UsuarioSecurityService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario;
		try {
			Optional<Usuario> opUsuario = usuarioRepository.findByLogin(username);
			if (!opUsuario.isPresent())
				throw new UsernameNotFoundException("Usuário não encontrado");
			else {
				usuario = opUsuario.get();
			}
		} catch (Exception e) {
			throw new UsernameNotFoundException("database error");
		}
		UsuarioSecurity springUser = buildUserFromUserEntity(usuario);
		return springUser;

	}

	@SuppressWarnings("unchecked")
	private UsuarioSecurity buildUserFromUserEntity(Usuario userEntity) {
		String username = userEntity.getLogin().toString();
		String password = userEntity.getSenha();

		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		boolean enable = true;

		String[] userRoles = { "admin" };
		AuthorityUtils.createAuthorityList(userRoles);

		Collection<? extends GrantedAuthority> authorities = (Collection<? extends GrantedAuthority>) AuthorityUtils
				.createAuthorityList(userRoles);

		UsuarioSecurity springUser = new UsuarioSecurity(username, password, enable, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);

		return springUser;

	}

}
