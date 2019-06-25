package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Funcionario;

public interface FuncionarioBCI {
	
	public void insert(Funcionario bean);
	public void update(Funcionario bean);
	public void delete(Funcionario bean);
	public Funcionario select(long id);
	public List<Funcionario> select();

}
