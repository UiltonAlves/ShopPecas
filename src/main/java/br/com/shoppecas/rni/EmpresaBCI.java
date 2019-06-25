package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Empresa;

public interface EmpresaBCI {

	public void insert(Empresa bean);
	public void update(Empresa bean);
	public void delete(Empresa bean);
	public Empresa select(long id);
	public List<Empresa> select();

	
}