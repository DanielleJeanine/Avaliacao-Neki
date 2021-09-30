package br.com.neki.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idUsuario;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String senha;

	@Column(name = "last_login_date")
	private LocalDate ultimoLogin;

	@OneToMany
	private List<UsuarioSkill> usuarioSkill;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long idUsuario, String login, String senha, LocalDate ultimoLogin, List<UsuarioSkill> usuarioSkill) {
		super();
		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
		this.ultimoLogin = ultimoLogin;
		this.usuarioSkill = usuarioSkill;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(idUsuario, other.idUsuario);
	}
	
	
}
