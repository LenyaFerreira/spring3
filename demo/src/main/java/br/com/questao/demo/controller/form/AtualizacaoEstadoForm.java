package br.com.questao.demo.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.questao.demo.modelo.Estado;
import br.com.questao.demo.repository.EstadoRepository;

public class AtualizacaoEstadoForm {

	@NotNull @NotEmpty
	private String nome;
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Estado atualizar(Long id, EstadoRepository estadoRepository) {
		Estado estado = estadoRepository.getReferenceById(id);
		estado.setNome(this.nome);
	
		return estado;
	}
	
	
	
	
}
