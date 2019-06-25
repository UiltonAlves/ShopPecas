package br.com.shoppecas.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Empresa {
	
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_empresa")
		@SequenceGenerator(name = "seq_empresa", sequenceName = "empresa_seq", initialValue = 1, allocationSize = 1)
		@Id
		private Integer id;
		private String nomeFantasia;
		private String razaoSocial;
		private String cnpj;
		private String inscricaoEstadual;
		private String urlSite;
		
		@OneToMany(mappedBy="empresa")
		private List<CargoSalario> cargoSalario;
		

		public List<CargoSalario> getCargoSalario() {
			return cargoSalario;
		}
		public void setCargoSalario(List<CargoSalario> cargoSalario) {
			this.cargoSalario = cargoSalario;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNomeFantasia() {
			return nomeFantasia;
		}
		public void setNomeFantasia(String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
		}
		public String getRazaoSocial() {
			return razaoSocial;
		}
		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public String getInscricaoEstadual() {
			return inscricaoEstadual;
		}
		public void setInscricaoEstadual(String inscricaoEstadual) {
			this.inscricaoEstadual = inscricaoEstadual;
		}
		public String getUrlSite() {
			return urlSite;
		}
		public void setUrlSite(String urlSite) {
			this.urlSite = urlSite;
		}
}
