package br.com.shoppecas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Cidade {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cidade")
	@SequenceGenerator(name = "seq_cidade", sequenceName = "cidade_seq", initialValue = 1, allocationSize = 1)
	@Id
	private Integer id;
	private String nomeCidade;
	
	@ManyToOne
	private Estado estado;
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
