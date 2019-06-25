package br.com.shoppecas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class DadosBancario {
	
	@SequenceGenerator(name = "seq_dadosBancario", sequenceName = "seq_dadosBancario", initialValue = 1, allocationSize = 1)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_dadosBancario")
	@Id
	private Integer id;
	
	@ManyToOne
	private Banco banco;
	
	private String operacao;
	private String agencia;
	private String digitoAgencia;
	
	private String conta;
	private String digitoConta;
	
	
	
	
	public String getDigitoAgencia() {
		return digitoAgencia;
	}
	public void setDigitoAgencia(String digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}
	public String getDigitoConta() {
		return digitoConta;
	}
	public void setDigitoConta(String digitoConta) {
		this.digitoConta = digitoConta;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
}
