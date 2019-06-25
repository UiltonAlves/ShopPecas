package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Dependente;

public interface DependenteBCI {

	public void insert(Dependente bean);
	public void update(Dependente bean);
	public void delete(Dependente bean);
	public Dependente select(long id);
	public List<Dependente> select();

	
}