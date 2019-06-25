package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Contato;

public interface ContatoBCI {

	public void insert(Contato bean);
	public void update(Contato bean);
	public void delete(Contato bean);
	public Contato select(long id);
	public List<Contato> select();

	
}