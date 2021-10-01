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
@Table(name = "skill", schema = "teste_residencia")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skill_seq")
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "version")
	private String version;

	@Column(name = "description")
	private String description;

	@Column(name = "image_url")
	private String image_url;

	@OneToMany(mappedBy = "skill_id")
	private List<UserSkill> userSkill;

public Skill() {
	// TODO Auto-generated constructor stub
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getImage_url() {
	return image_url;
}

public void setImage_url(String image_url) {
	this.image_url = image_url;
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
	Skill other = (Skill) obj;
	return Objects.equals(id, other.id);
}


	
}
