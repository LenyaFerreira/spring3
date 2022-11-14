package br.com.questao.demo.controller;

import org.springframework.data.jpa.repository.*;

import br.com.questao.demo.modelo.Estado;



public interface Modifica extends JpaRepository<Estado, Long>{

	
}
