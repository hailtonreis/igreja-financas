package com.igreja.financas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja.financas.entity.Conferencia;
import com.igreja.financas.service.ConferenciaService;

@RestController
@RequestMapping("/conferencias")
public class ConferenciaController {

	private final ConferenciaService conferenciaService;

	@Autowired
	public ConferenciaController(ConferenciaService conferenciaService) {
		this.conferenciaService = conferenciaService;
	}

	@GetMapping("/visualizar-dados")
	public ResponseEntity<List<Conferencia>> visualizarDados(){
		List<Conferencia> conferencias = conferenciaService.listarTodos();
		return ResponseEntity.ok(conferencias);
	}
	
	
}
