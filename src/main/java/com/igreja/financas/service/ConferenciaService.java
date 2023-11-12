package com.igreja.financas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.igreja.financas.entity.Conferencia;

@Service
public interface ConferenciaService {
	
	List<Conferencia> getAllConferencias();
	
//	Conferencia getConferenciaById(Long Id);
	
}