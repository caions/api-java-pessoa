package br.com.impacta.quizapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.quizapi.model.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Integer> {

}
