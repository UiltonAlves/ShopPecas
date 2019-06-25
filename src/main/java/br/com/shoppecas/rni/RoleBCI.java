package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.Role;

public interface RoleBCI {

	public void insert(Role bean);
	public void update(Role bean);
	public void delete(Role bean);
	public List<Role> select();
	
}