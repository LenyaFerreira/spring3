package br.com.questao.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.questao.demo.modelo.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	List<Estado> findAll();

	List<Estado> findByRegiao(String regiaoEstado);


	
	
	
}
