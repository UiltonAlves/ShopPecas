package br.com.shoppecas.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pagina {

	@Id
	private Integer id;
	private String url;
	private String descricao;
	
	public Pagina() {}
	
	public Pagina(String url) {
		this.url = url;
	}

	
	
	
	//Metodos Geters e Seters

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}