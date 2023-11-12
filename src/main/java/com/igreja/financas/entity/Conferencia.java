package com.igreja.financas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Data
@Table(name = "conferencia")
public class Conferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="FORMA")
	private String forma;
	
	@Column(name="VALOR")
	private String valor;
	
	@Column(name="DT_REGISTRO")
	private Date dataRegistro;
	
	@Column(name="DESCRICAO")
	private String descricao;
}
