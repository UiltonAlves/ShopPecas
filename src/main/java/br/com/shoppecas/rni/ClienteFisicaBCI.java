package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.ClienteFisica;

public interface ClienteFisicaBCI {
	
	public void insert(ClienteFisica bean);
	public void update(ClienteFisica bean);
	public void delete(ClienteFisica bean);
	public ClienteFisica select(long id);
	public List<ClienteFisica> select();

}
