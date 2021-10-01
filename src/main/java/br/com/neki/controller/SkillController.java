package br.com.neki.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.neki.model.Skill;
import br.com.neki.service.SkillService;

@RestController
@RequestMapping("/skill")
@CrossOrigin(value = "*")
public class SkillController {
	
	@Autowired
	SkillService skillService;

	@GetMapping("/{id}")
	public ResponseEntity<Skill> find (@PathVariable Long id) {
		if (skillService.find(id) == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(skillService.find(id));
		}
	}

	@GetMapping
	public ResponseEntity<List<Skill>> list() {
		return ResponseEntity.ok(skillService.list());

	}

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Skill add (@RequestBody Skill skill) {
		return skillService.add(skill);
	}

	@PutMapping("{/id}")
	public ResponseEntity<Skill> update (@PathVariable Long id, @RequestBody Skill skill) {
		if (skillService.update (id, skill) == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(skillService.update(id, skill));
		}
	}
	
	@DeleteMapping("{/id}")
	public void delete (@PathVariable Long id){
		skillService.delete(id);
	}

}
