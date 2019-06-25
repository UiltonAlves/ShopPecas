package br.com.shoppecas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Telefone {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_telefone")
	@SequenceGenerator(name = "seq_telefone", sequenceName = "telefone_seq", initialValue = 1, allocationSize = 1)
	@Id
	private Integer id;
	private String descricao;
	private String numero;	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}	
	
}
