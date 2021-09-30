package br.com.neki.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.neki.model.Usuario;
import br.com.neki.model.UsuarioSkill;

public class UsuarioDTO {
	private Long idUsuario;
	private String login;
	private LocalDate ultimoLogin;
	private List<UsuarioSkill> usuarioSkill = new ArrayList<UsuarioSkill>();

	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioDTO(Usuario usuario) {
		super();
		this.idUsuario = usuario.getIdUsuario();
		this.login = usuario.getLogin();
		this.ultimoLogin = usuario.getUltimoLogin();
		this.usuarioSkill = usuario.getUsuarioSkill();
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public LocalDate getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(LocalDate ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public List<UsuarioSkill> getUsuarioSkill() {
		return usuarioSkill;
	}

	public void setUsuarioSkill(List<UsuarioSkill> usuarioSkill) {
		this.usuarioSkill = usuarioSkill;
	}

}
