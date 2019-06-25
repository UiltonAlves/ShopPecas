package br.com.shoppecas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class ServidorEmail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_servEmail")
	@SequenceGenerator(name = "seq_servEmail", sequenceName = "servEmail_seq", initialValue = 1, allocationSize = 1)
	private Integer id;
	private String host;
	private String username;
	private String password;
	private Integer port;
	private Boolean ativo;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
