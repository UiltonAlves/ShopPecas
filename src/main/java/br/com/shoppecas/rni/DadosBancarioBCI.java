package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.DadosBancario;

public interface DadosBancarioBCI {

	public void insert(DadosBancario bean);
	public void update(DadosBancario bean);
	public void delete(DadosBancario bean);
	public DadosBancario select(long id);
	public List<DadosBancario> select();

	
}