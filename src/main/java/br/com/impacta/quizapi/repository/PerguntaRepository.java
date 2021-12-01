package br.com.impacta.quizapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.quizapi.model.Pergunta;

public interface PerguntaRepository extends JpaRepository<Pergunta,Integer> {

}
