package br.com.shoppecas.models;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Dependente {

	@SequenceGenerator(name = "seq_dependentes", sequenceName = "seq_dependentes", initialValue = 1, allocationSize = 1)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_dependentes")
	@Id
	private Integer id;
	
	@ManyToOne
	private Funcionario funcionario;
	private String tipoDeDependencia;
	
	private String nome;
	private String cpf;
	private Calendar dataNascimento;
	private String localDeNascimento;

	private String matriculaRegistro;
	private String cartorio;
	private String numeroRegistroCartorio;
	private String numeroLivro;
	private String numeroFolha;
	private String numeroDNV;
	private Calendar dataEntregaDocumeto;
	private Calendar vencimentoAtestadoFrequencia;//Para o salario Familia
	private Calendar vencimentoCarteiraVacinacao;//Para o salario Familia
	private Calendar vencimentoPensaoAlimenticia;
	private Boolean irrf;

	
	
	//Metodos Gets e Sets
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLocalDeNascimento() {
		return localDeNascimento;
	}
	public void setLocalDeNascimento(String localDeNascimento) {
		this.localDeNascimento = localDeNascimento;
	}
	public String getTipoDeDependencia() {
		return tipoDeDependencia;
	}
	public void setTipoDeDependencia(String tipoDeDependencia) {
		this.tipoDeDependencia = tipoDeDependencia;
	}
	public String getMatriculaRegistro() {
		return matriculaRegistro;
	}
	public void setMatriculaRegistro(String matriculaRegistro) {
		this.matriculaRegistro = matriculaRegistro;
	}
	public String getCartorio() {
		return cartorio;
	}
	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
	public String getNumeroRegistroCartorio() {
		return numeroRegistroCartorio;
	}
	public void setNumeroRegistroCartorio(String numeroRegistroCartorio) {
		this.numeroRegistroCartorio = numeroRegistroCartorio;
	}
	public String getNumeroLivro() {
		return numeroLivro;
	}
	public void setNumeroLivro(String numeroLivro) {
		this.numeroLivro = numeroLivro;
	}
	public String getNumeroFolha() {
		return numeroFolha;
	}
	public void setNumeroFolha(String numeroFolha) {
		this.numeroFolha = numeroFolha;
	}
	public String getNumeroDNV() {
		return numeroDNV;
	}
	public void setNumeroDNV(String numeroDNV) {
		this.numeroDNV = numeroDNV;
	}
	public Calendar getDataEntregaDocumeto() {
		return dataEntregaDocumeto;
	}
	public void setDataEntregaDocumeto(Calendar dataEntregaDocumeto) {
		this.dataEntregaDocumeto = dataEntregaDocumeto;
	}
	public Calendar getVencimentoAtestadoFrequencia() {
		return vencimentoAtestadoFrequencia;
	}
	public void setVencimentoAtestadoFrequencia(Calendar vencimentoAtestadoFrequencia) {
		this.vencimentoAtestadoFrequencia = vencimentoAtestadoFrequencia;
	}
	public Calendar getVencimentoCarteiraVacinacao() {
		return vencimentoCarteiraVacinacao;
	}
	public void setVencimentoCarteiraVacinacao(Calendar vencimentoCarteiraVacinacao) {
		this.vencimentoCarteiraVacinacao = vencimentoCarteiraVacinacao;
	}
	public Calendar getVencimentoPensaoAlimenticia() {
		return vencimentoPensaoAlimenticia;
	}
	public void setVencimentoPensaoAlimenticia(Calendar vencimentoPensaoAlimenticia) {
		this.vencimentoPensaoAlimenticia = vencimentoPensaoAlimenticia;
	}
	public Boolean getIrrf() {
		return irrf;
	}
	public void setIrrf(Boolean irrf) {
		this.irrf = irrf;
	}
	
	
		
}
