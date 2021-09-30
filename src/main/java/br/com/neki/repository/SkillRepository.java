package br.com.neki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.neki.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
