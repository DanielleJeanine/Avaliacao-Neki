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
@Table(name = "user_skill",  schema = "teste_residencia")
public class UserSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "skill_id")
	private Skill skill_id;

	@Column(name = "knowledge_level")
	private Long knowledge_levell;

	@Column(name = "created_at")
	private LocalDate created_at;

	@Column(name = "updated_at")
	private LocalDate updated_at;

	public UserSkill() {
		// TODO Auto-generated constructor stub
	}

	public UserSkill(Long id, User user_id, Skill skill_id, Long knowledge_levell, LocalDate created_at,
			LocalDate updated_at) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.skill_id = skill_id;
		this.knowledge_levell = knowledge_levell;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public Skill getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(Skill skill_id) {
		this.skill_id = skill_id;
	}

	public Long getKnowledge_levell() {
		return knowledge_levell;
	}

	public void setKnowledge_levell(Long knowledge_levell) {
		this.knowledge_levell = knowledge_levell;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public LocalDate getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
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
		UserSkill other = (UserSkill) obj;
		return Objects.equals(id, other.id);
	}

	
}
