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
@Table(name = "user", schema = "teste_residencia")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "last_login_date")
	private LocalDate last_login_date;

	@OneToMany (mappedBy = "user_id")
	private List<UserSkill> userSkill;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String login, String password, LocalDate last_login_date, List<UserSkill> userSkill) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.last_login_date = last_login_date;
		this.userSkill = userSkill;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getLast_login_date() {
		return last_login_date;
	}

	public void setLast_login_date(LocalDate last_login_date) {
		this.last_login_date = last_login_date;
	}

	public List<UserSkill> getUserSkill() {
		return userSkill;
	}

	public void setUsuarioSkill(List<UserSkill> userSkill) {
		this.userSkill = userSkill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	
}
