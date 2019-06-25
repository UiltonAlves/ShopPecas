package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Pagina;

public interface PaginaBCI {

	public void insert(Pagina bean);
	public void update(Pagina bean);
	public void delete(Pagina bean);
	public List<Pagina> select();

	
}