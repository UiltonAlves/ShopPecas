package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Telefone;

public interface TelefoneBCI {

	public void insert(Telefone bean);
	public void update(Telefone bean);
	public void delete(Telefone bean);
	public List<Telefone> select();

	
}