package br.com.shoppecas.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Estado {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estado")
	@SequenceGenerator(name = "seq_estado", sequenceName = "estado_seq", initialValue = 1, allocationSize = 1)
	@Id
	private Integer id;
	private String nomeUf;
	
	@OneToMany(targetEntity=Cidade.class,mappedBy="estado")
	private List<Cidade> cidades;
	
	public List<Cidade> getCidades() {
		return cidades;
	}
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeUf() {
		return nomeUf;
	}
	public void setNomeUf(String nomeUf) {
		this.nomeUf = nomeUf;
	}
}
