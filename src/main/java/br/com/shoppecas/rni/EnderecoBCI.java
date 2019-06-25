package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Endereco;

public interface EnderecoBCI {

	public void insert(Endereco bean);
	public void update(Endereco bean);
	public void delete(Endereco bean);
	public Endereco select(long id);
	public List<Endereco> select();

	
}