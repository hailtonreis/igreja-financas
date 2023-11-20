package com.igreja.financas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreja.financas.entity.Conferencia;
import com.igreja.financas.repository.ConferenciaRepository;

@Service
public class ConferenciaService {

	private ConferenciaRepository conferenciaRepository;

	@Autowired
	public void Conferencia(ConferenciaRepository conferenciaRepository) {
		this.conferenciaRepository = conferenciaRepository;
	}

	public List<Conferencia> listarTodos() {
		return conferenciaRepository.findAll();
	}
	
	 public Conferencia salvar(Conferencia conferencia) {
	        return conferenciaRepository.save(conferencia);
	    }

}