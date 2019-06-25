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
public class ClienteFisica {
	
	
	@SequenceGenerator(name = "seq_clienteFisica", sequenceName = "seq_clienteFisica", initialValue = 1, allocationSize = 1)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_clienteFisica")
	@Id
	private Integer id;
	
	@OneToOne
	private Usuario usuario;
	
	private Boolean bloqueado;
	private String nome;
	private String apelido;
	private String cpf;
	private String rg;
	private String emissor;
	private String uf;
	private String sexo;
	
	private Calendar aniversario;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Calendar getAniversario() {
		return aniversario;
	}

	public void setAniversario(Calendar aniversario) {
		this.aniversario = aniversario;
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
