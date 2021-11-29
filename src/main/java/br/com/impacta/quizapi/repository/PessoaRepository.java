package br.com.impacta.quizapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.quizapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {

}
