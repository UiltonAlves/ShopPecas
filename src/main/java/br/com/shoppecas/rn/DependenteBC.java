package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.DependenteDaoI;
import br.com.shoppecas.models.Dependente;
import br.com.shoppecas.rni.DependenteBCI;

@Controller
public class DependenteBC implements DependenteBCI{

	@Autowired
	private DependenteDaoI dao;
	
	public void insert(Dependente bean) {
		dao.save(bean);
	}

	public void update(Dependente bean) {
		dao.save(bean);
	}

	public void delete(Dependente bean) {
		dao.delete(bean);
	}

	public List<Dependente> select() {
		return dao.findAll();
	}

	public Dependente select(long id) {
		
		return dao.findById(id);
	}
}
