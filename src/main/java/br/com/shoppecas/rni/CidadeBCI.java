package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Cidade;

public interface CidadeBCI {

	public void insert(Cidade bean);
	public void update(Cidade bean);
	public void delete(Cidade bean);
	public Cidade select(long id);
	public List<Cidade> select();

	
}