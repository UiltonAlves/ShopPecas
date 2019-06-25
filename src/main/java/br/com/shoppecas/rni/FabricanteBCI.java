package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Fabricante;

public interface FabricanteBCI {
	
	public void insert(Fabricante bean);
	public void update(Fabricante bean);
	public void delete(Fabricante bean);
	public Fabricante select(long id);
	public List<Fabricante> select();

}
