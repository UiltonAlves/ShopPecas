package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Documentos;

public interface DocumentosBCI {

	public void insert(Documentos bean);
	public void update(Documentos bean);
	public void delete(Documentos bean);
	public Documentos select(long id);
	public List<Documentos> select();

	
}