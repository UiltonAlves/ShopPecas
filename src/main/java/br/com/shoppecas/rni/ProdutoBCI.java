package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Produto;

public interface ProdutoBCI {
	
	public void insert(Produto bean);
	public void update(Produto bean);
	public void delete(Produto bean);
	public Produto select(long id);
	public List<Produto> select();

}
