package com.igreja.financas.service;

public class ConferenciaNaoEncontradaException extends RuntimeException {
	public ConferenciaNaoEncontradaException(String mensagem) {
		super(mensagem);
	}

	public ConferenciaNaoEncontradaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
