package br.com.neki.DTO;

import java.time.LocalDate;

import br.com.neki.model.Skill;
import br.com.neki.model.Usuario;
import br.com.neki.model.UsuarioSkill;

public class UsuarioSkillDTO {
	private Long id;
	private Usuario idUsuario;
	private Skill idSkill;
	private Long nivel;
	private LocalDate criado;
	private LocalDate atualizado;

	public UsuarioSkillDTO() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioSkillDTO(UsuarioSkill usuarioSkill) {
		super();
		this.id = usuarioSkill.getId();
		this.idUsuario = usuarioSkill.getIdUsuario();
		this.idSkill = usuarioSkill.getIdSkill();
		this.nivel = usuarioSkill.getNivel();
		this.criado = usuarioSkill.getCriado();
		this.atualizado = usuarioSkill.getAtualizado();
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

	

}
