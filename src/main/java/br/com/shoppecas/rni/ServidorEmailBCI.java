package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.ServidorEmail;

public interface ServidorEmailBCI {

	public void insert(ServidorEmail bean);
	public void update(ServidorEmail bean);
	public void delete(ServidorEmail bean);
	public List<ServidorEmail> select();
	public ServidorEmail selectAtivo(Boolean ativo);
	
	
}