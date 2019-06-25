package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Usuario;

public interface UsuarioBCI {

	public void insert(Usuario bean);
	public void update(Usuario bean);
	public void delete(Usuario bean);
	public List<Usuario> select();
	public Usuario selectLogin(String usuario);
	
}