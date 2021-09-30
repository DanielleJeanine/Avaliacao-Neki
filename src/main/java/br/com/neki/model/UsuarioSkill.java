package br.com.neki.model;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "user_skill")
public class UsuarioSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Usuario idUsuario;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "skill_id")
	private Skill idSkill;

	@Column(name = "knowledge_level")
	private Long nivel;

	@Column(name = "created_at")
	private LocalDate criado;

	@Column(name = "updated_at")
	private LocalDate atualizado;

	public UsuarioSkill() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioSkill(Long id, Usuario idUsuario, Skill idSkill, Long nivel, LocalDate criado, LocalDate atualizado) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idSkill = idSkill;
		this.nivel = nivel;
		this.criado = criado;
		this.atualizado = atualizado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Skill getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(Skill idSkill) {
		this.idSkill = idSkill;
	}

	public Long getNivel() {
		return nivel;
	}

	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}

	public LocalDate getCriado() {
		return criado;
	}

	public void setCriado(LocalDate criado) {
		this.criado = criado;
	}

	public LocalDate getAtualizado() {
		return atualizado;
	}

	public void setAtualizado(LocalDate atualizado) {
		this.atualizado = atualizado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioSkill other = (UsuarioSkill) obj;
		return Objects.equals(id, other.id);
	}

}
