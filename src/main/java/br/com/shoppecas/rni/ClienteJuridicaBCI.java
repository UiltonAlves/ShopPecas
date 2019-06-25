package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.ClienteJuridica;

public interface ClienteJuridicaBCI {
	
	public void insert(ClienteJuridica bean);
	public void update(ClienteJuridica bean);
	public void delete(ClienteJuridica bean);
	public ClienteJuridica select(long id);
	public List<ClienteJuridica> select();

}
