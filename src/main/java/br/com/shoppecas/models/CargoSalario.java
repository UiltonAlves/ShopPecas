package br.com.shoppecas.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CargoSalario {

	@SequenceGenerator(name = "seq_cargoSalario", sequenceName = "seq_cargoSalario", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cargoSalario")
	@Id
	private Integer id;
	private String cargo;
	private String descricao;
	private BigDecimal salario;
	private Boolean desabilitado;

	@ManyToOne
	private Empresa empresa;

	@ManyToMany(mappedBy = "cargoSalario")
	private List<Funcionario> funcionarios;
	
	
	

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Boolean getDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(Boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
