package br.com.shoppecas.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Produto {

	@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	@Id
	private Integer id;
	
	@ManyToOne
	private CategoriaProduto categoriaPrincipal;
	
	@ManyToOne
	private CategoriaProduto categoriaSecundaria;
	
	private String nome;
	private String descricao;
	private String codigodebarra;
	private String composicao;
	
	@OneToOne
	private Fabricante fabricante;
	
	private String ncm;//Nome comum do mercosul
	private String garantiadofabricante;//Garantia é o prazo que o consumidor dispõe para reclamar dos vícios (defeitos) constatados em produtos adquiridos. Preencher com o número e a unidade de medida. Exemplo: 24 meses
	private BigDecimal valor;
	private String foto;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getGarantiadofabricante() {
		return garantiadofabricante;
	}
	public void setGarantiadofabricante(String garantiadofabricante) {
		this.garantiadofabricante = garantiadofabricante;
	}
	public String getNcm() {
		return ncm;
	}
	public void setNcm(String ncm) {
		this.ncm = ncm;
	}
	public String getCodigodebarra() {
		return codigodebarra;
	}
	public void setCodigodebarra(String codigodebarra) {
		this.codigodebarra = codigodebarra;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	
	public CategoriaProduto getCategoriaPrincipal() {
		return categoriaPrincipal;
	}
	public void setCategoriaPrincipal(CategoriaProduto categoriaPrincipal) {
		this.categoriaPrincipal = categoriaPrincipal;
	}
	public CategoriaProduto getCategoriaSecundaria() {
		return categoriaSecundaria;
	}
	public void setCategoriaSecundaria(CategoriaProduto categoriaSecundaria) {
		this.categoriaSecundaria = categoriaSecundaria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
