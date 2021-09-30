package br.com.neki.model;

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
@Table(name = "skill")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idSkill;

	@Column(name = "name")
	private String nome;

	@Column(name = "version")
	private String versao;

	@Column(name = "description")
	private String descricao;

	@Column(name = "image_url")
	private String imagem;

	@OneToMany
	private List<UsuarioSkill> usuarioSkill;

	public Skill() {
		// TODO Auto-generated constructor stub
	}

	public Skill(Long idSkill, String nome, String versao, String descricao, String imagem,
			List<UsuarioSkill> usuarioSkill) {
		super();
		this.idSkill = idSkill;
		this.nome = nome;
		this.versao = versao;
		this.descricao = descricao;
		this.imagem = imagem;
		this.usuarioSkill = usuarioSkill;
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

	public List<UsuarioSkill> getUsuarioSkill() {
		return usuarioSkill;
	}

	public void setUsuarioSkill(List<UsuarioSkill> usuarioSkill) {
		this.usuarioSkill = usuarioSkill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idSkill);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		return Objects.equals(idSkill, other.idSkill);
	}

}
