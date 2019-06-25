package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.RoleDaoI;
import br.com.shoppecas.models.Role;
import br.com.shoppecas.rni.RoleBCI;

@Controller
public class RoleBC implements RoleBCI{

	@Autowired
	private RoleDaoI dao;
	
	public void insert(Role role) {
		dao.save(role);
	}

	public void update(Role role) {
		dao.save(role);
	}

	public void delete(Role role) {
		dao.delete(role);
	}

	public List<Role> select() {
		return dao.findAll();
	}
}
