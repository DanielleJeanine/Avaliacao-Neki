package br.com.neki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.neki.model.UserSkill;

public interface UserSkillRepository extends JpaRepository<UserSkill,Long> {

}
