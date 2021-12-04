package br.com.impacta.quizapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Historico {
	
	@Id
	@GeneratedValue
	private int id;
	private String execucao;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "pessoa_id",referencedColumnName = "id")
	private Pessoa pessoa;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "pergunta_id", referencedColumnName = "id")
	private Pergunta pergunta;
	
	private int resposta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExecucao() {
		return execucao;
	}

	public void setExecucao(String execucao) {
		this.execucao = execucao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
	
	
}
