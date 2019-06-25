package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.CategoriaProduto;

public interface CategoriaProdutoBCI {
	
	public void insert(CategoriaProduto bean);
	public void update(CategoriaProduto bean);
	public void delete(CategoriaProduto bean);
	public CategoriaProduto select(long id);
	public List<CategoriaProduto> select();

}
