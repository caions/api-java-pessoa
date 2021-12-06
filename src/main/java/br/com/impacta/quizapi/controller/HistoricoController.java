package br.com.impacta.quizapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.impacta.quizapi.model.Historico;
import br.com.impacta.quizapi.repository.HistoricoRepository;

@CrossOrigin(origins = "https://java-quiz-api.herokuapp.com", maxAge = 3600)
@RestController
@RequestMapping("/historico")
public class HistoricoController {

	@Autowired
	HistoricoRepository repository;

	@GetMapping("")
	public List<Historico> findAll() {
		return repository.findAll();
	}

	@PostMapping("")
	public Historico create(@RequestBody Historico entrada) {
		return repository.save(entrada);
	}

	@GetMapping("/{id}")
	public Optional<Historico> getOne(@PathVariable int id){
		return repository.findById(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		repository.deleteById(id);
	}

}
