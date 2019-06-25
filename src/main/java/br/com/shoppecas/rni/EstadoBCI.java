package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Estado;

public interface EstadoBCI {

	public void insert(Estado bean);
	public void update(Estado bean);
	public void delete(Estado bean);
	public Estado select(long id);
	public List<Estado> select();

	
}