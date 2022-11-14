package br.com.questao.demo.controller.form;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import br.com.questao.demo.modelo.Estado;


public class EstadoForm {
	
	private Long id;
	private String nome;
	

	@NotNull @NotEmpty
	private String regiao;
	private int populacao;
	private String capital;
	private int area;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String reagia) {
		this.regiao = reagia;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Long getId() {
		return id;
	}
	
	public Estado converter() {
		return new Estado(nome, regiao, populacao,capital,area);
	}
	
	

}
