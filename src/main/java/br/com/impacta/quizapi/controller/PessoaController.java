package br.com.impacta.quizapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.impacta.quizapi.model.Pessoa;
import br.com.impacta.quizapi.repository.PessoaRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	PessoaRepository repository;

	@GetMapping("")
	public List<Pessoa> getAll() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Pessoa> getOne(@PathVariable int id) {
		return repository.findById(id);
	}

	@PostMapping("")
	public Pessoa create(@RequestBody Pessoa entrada) {
		return repository.save(entrada);
	}


	@PutMapping("/{id}")
	public Pessoa update(@RequestBody Pessoa entrada, @PathVariable int id) {
		entrada.setId(id);
		return repository.save(entrada);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		Pessoa pessoa = repository.getById(id);
		repository.deleteById(pessoa.getId());
	}

}