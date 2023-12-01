package com.igreja.financas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja.financas.entity.Conferencia;
import com.igreja.financas.repository.ConferenciaRepository;
import com.igreja.financas.service.ConferenciaService;

@RestController
@RequestMapping("/conferencias")
public class ConferenciaController {

	private final ConferenciaService conferenciaService;
	private final ConferenciaRepository conferenciaRepository; 

	@Autowired
	public ConferenciaController(ConferenciaService conferenciaService, ConferenciaRepository conferenciaRepository) {
		this.conferenciaService = conferenciaService;
		this.conferenciaRepository = conferenciaRepository;
	}

	@GetMapping("/visualizar-dados")
	public ResponseEntity<List<Conferencia>> visualizarDados(){
		List<Conferencia> conferencias = conferenciaService.listarTodos();
		return ResponseEntity.ok(conferencias);
	}
	
	@PostMapping("/salvar")
	public void salvar(@RequestBody Conferencia conferencia) {
		conferenciaRepository.save(conferencia);
	}
	
	
}
