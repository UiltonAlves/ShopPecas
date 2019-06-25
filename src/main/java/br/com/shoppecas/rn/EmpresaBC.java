package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.EmpresaDaoI;
import br.com.shoppecas.models.Empresa;
import br.com.shoppecas.rni.EmpresaBCI;

@Controller
public class EmpresaBC implements EmpresaBCI{

	@Autowired
	private EmpresaDaoI dao;
	
	public void insert(Empresa bean) {
		dao.save(bean);
	}

	public void update(Empresa bean) {
		dao.save(bean);
	}

	public void delete(Empresa bean) {
		dao.delete(bean);
	}

	public List<Empresa> select() {
		return dao.findAll();
	}

	public Empresa select(long id) {
		
		return dao.findById(id);
	}
}
