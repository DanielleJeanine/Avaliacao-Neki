package br.com.neki.DTO;

import br.com.neki.model.Skill;

public class SkillDTO {
	private Long idSkill;
	private String nome;
	private String versao;
	private String descricao;
	private String imagem;

	public SkillDTO() {
		// TODO Auto-generated constructor stub
	}

	public SkillDTO(Skill skill) {
		super();
		this.idSkill = skill.getIdSkill();
		this.nome = skill.getNome();
		this.versao = skill.getVersao();
		this.descricao = skill.getDescricao();
		this.imagem = skill.getImagem();
	}

	public Long getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(Long idSkill) {
		this.idSkill = idSkill;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	
}
