package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Banco;

public interface BancoBCI {

	public void insert(Banco bean);
	public void update(Banco bean);
	public void delete(Banco bean);
	public Banco select(long id);
	public List<Banco> select();

	
}