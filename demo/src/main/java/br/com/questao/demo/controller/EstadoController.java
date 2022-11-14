package br.com.questao.demo.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.questao.demo.controller.dto.EstadoDto;
import br.com.questao.demo.controller.form.AtualizacaoEstadoForm;
import br.com.questao.demo.controller.form.EstadoForm;
import br.com.questao.demo.modelo.Estado;
import br.com.questao.demo.repository.EstadoRepository;

@RestController
@RequestMapping("/estados")
public class EstadoController {
	
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public List<EstadoDto> lista(String regiaoEstado) {
		if (regiaoEstado == null) {
			List<Estado> estados = estadoRepository.findAll();
			return EstadoDto.converter(estados);
		} else {
			List<Estado> estados = estadoRepository.findByRegiao(regiaoEstado);
			return EstadoDto.converter(estados);
		}
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<EstadoDto> cadastrar(@RequestBody @Valid EstadoForm form, UriComponentsBuilder uriBuilder) {
		Estado estado = form.converter();
		estadoRepository.save(estado);
		
		URI uri = uriBuilder.path("/estados/{id}").buildAndExpand(estado.getId()).toUri();
		return ResponseEntity.created(uri).body(new EstadoDto(estado));
	}
	
	@GetMapping("/{id}")
	public EstadoDto detalhar(@PathVariable Long id) {
		Estado estado = estadoRepository.getOne(id);
		return new EstadoDto(estado);
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<EstadoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoEstadoForm form) {
		Estado estado = form.atualizar(id, estadoRepository);
		return ResponseEntity.ok(new EstadoDto(estado));	
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {
		estadoRepository.deleteById(id);
		return ResponseEntity.ok().build();	
	}
	
}

