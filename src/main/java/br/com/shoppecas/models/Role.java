package br.com.shoppecas.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private String nomeRole;
	private String descricao;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.PERSIST)
	private List<Pagina> paginas;
	
	public Role() {}
	
	public Role(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	//Metodos Geters e Seters

	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Pagina> getPaginas() {
		return paginas;
	}

	public void setPaginas(List<Pagina> paginas) {
		this.paginas = paginas;
	}

	public String getAuthority() {
		return this.nomeRole;
	}
}