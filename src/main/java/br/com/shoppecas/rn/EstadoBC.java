package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.EstadoDaoI;
import br.com.shoppecas.models.Estado;
import br.com.shoppecas.rni.EstadoBCI;

@Controller
public class EstadoBC implements EstadoBCI{

	@Autowired
	private EstadoDaoI dao;
	
	public void insert(Estado bean) {
		dao.save(bean);
	}

	public void update(Estado bean) {
		dao.save(bean);
	}

	public void delete(Estado bean) {
		dao.delete(bean);
	}

	public List<Estado> select() {
		return dao.findAll();
	}

	public Estado select(long id) {
		
		return dao.findById(id);
	}
}
