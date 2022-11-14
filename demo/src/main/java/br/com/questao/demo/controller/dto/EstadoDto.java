package br.com.questao.demo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.questao.demo.modelo.Estado;

public class EstadoDto {
	
	
	private Long id;
	private String nome;
	private String regiao;
	private int populacao;
	private String capital;
	private int area;
	
	
	
	
	public EstadoDto(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();

	}
	public String getNome() {
		return nome;
	}
	public Long getId() {
		return id;
	}
	public String getRegiao() {
		return regiao;
	}
	public int getPopulacao() {
		return populacao;
	}
	public String getCapital() {
		return capital;
	}
	public int getArea() {
		return area;
	}
	public static List<EstadoDto> converter(List<Estado> estados) {
		return estados.stream().map(EstadoDto::new).collect(Collectors.toList());
	}
	
	
	
	

}
