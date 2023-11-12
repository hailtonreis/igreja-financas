package com.igreja.financas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja.financas.entity.Conferencia;
import com.igreja.financas.service.ConferenciaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class ConferenciaController {

	
	@Autowired
	private ConferenciaService conferenciaService;
	
	@GetMapping("/conferencia")
	public ResponseEntity<List<Conferencia>> getAllConferencia(){
		List<Conferencia> conferencias = conferenciaService.getAllConferencias();
		
		return new ResponseEntity<>(conferencias, HttpStatus.OK);
	}
	
	
	
	
}

