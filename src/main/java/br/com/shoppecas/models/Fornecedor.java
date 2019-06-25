package br.com.shoppecas.models;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Fornecedor {
	
	
	@SequenceGenerator(name = "seq_fornecedor", sequenceName = "seq_fornecedor", initialValue = 1, allocationSize = 1)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fornecedor")
	@Id
	private Integer id;
	
	@OneToOne
	private Usuario usuario;
	
	private Boolean bloqueado;
	private String racaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String indicadorDaIEdoDestinatario;
	private String inscricaoEstadual;
	private String inscricaoMunicial;
	
	private Calendar dataCadastro;
	
	private String telefone;
	private String celular;
	private String email;
	private String site;
	private String observacoes;
	private BigDecimal limiteCredito;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Endereco> endereco;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Contato> contato;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<DadosBancario> dadosBancario;

	//Metodos Gets e Sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Boolean getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public String getRacaoSocial() {
		return racaoSocial;
	}

	public void setRacaoSocial(String racaoSocial) {
		this.racaoSocial = racaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIndicadorDaIEdoDestinatario() {
		return indicadorDaIEdoDestinatario;
	}

	public void setIndicadorDaIEdoDestinatario(String indicadorDaIEdoDestinatario) {
		this.indicadorDaIEdoDestinatario = indicadorDaIEdoDestinatario;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicial() {
		return inscricaoMunicial;
	}

	public void setInscricaoMunicial(String inscricaoMunicial) {
		this.inscricaoMunicial = inscricaoMunicial;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public List<DadosBancario> getDadosBancario() {
		return dadosBancario;
	}

	public void setDadosBancario(List<DadosBancario> dadosBancario) {
		this.dadosBancario = dadosBancario;
	}




}
