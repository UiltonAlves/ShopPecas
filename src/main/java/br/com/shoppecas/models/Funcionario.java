package br.com.shoppecas.models;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Funcionario {

	@SequenceGenerator(name = "seq_funcionario", sequenceName = "seq_funcionario", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_funcionario")
	@Id
	private Integer id;
	
	@OneToOne
	private Usuario usuario;

	private String nome;
	private String apelido;

	private String sexo;

	private Calendar aniversario;
	private Calendar dataAdmissao;
	private Calendar dataRecisao;
	
	private String estadoCivil;
	private String conjugue;
	
	private String telefone;
	private String celular;
	private String email;
	private String observacoes;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Documentos> documentos;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Endereco> endereco;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Contato> contato;

	@OneToMany(cascade = CascadeType.ALL)
	private List<DadosBancario> dadosBancario;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Dependente> dependentes;

	@ManyToMany
	@JoinTable(name = "funcionario_CargoSalario", 
				joinColumns = { @JoinColumn(name = "funcionario_id") },
				inverseJoinColumns = { @JoinColumn(name = "cargoSalario_id") })
	private List<CargoSalario> cargoSalario;

	// Metodos Gets e Sets

	
	
	public Integer getId() {
		return id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getConjugue() {
		return conjugue;
	}

	public void setConjugue(String conjugue) {
		this.conjugue = conjugue;
	}

	public List<CargoSalario> getCargoSalario() {
		return cargoSalario;
	}

	public void setCargoSalario(List<CargoSalario> cargoSalario) {
		this.cargoSalario = cargoSalario;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Calendar getDataRecisao() {
		return dataRecisao;
	}

	public void setDataRecisao(Calendar dataRecisao) {
		this.dataRecisao = dataRecisao;
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

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Documentos> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documentos> documentos) {
		this.documentos = documentos;
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

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	

}
