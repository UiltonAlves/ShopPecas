package br.com.shoppecas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Banco {
	
	@SequenceGenerator(name = "seq_banco", sequenceName = "seq_banco", initialValue = 1, allocationSize = 1)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_banco")
	@Id
	private Integer id;
	private String codigo;
	private String nome;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	
}
