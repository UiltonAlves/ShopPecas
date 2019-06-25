package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.ContatoDaoI;
import br.com.shoppecas.models.Contato;
import br.com.shoppecas.rni.ContatoBCI;

@Controller
public class ContatoBC implements ContatoBCI{

	@Autowired
	private ContatoDaoI dao;
	
	public void insert(Contato bean) {
		dao.save(bean);
	}

	public void update(Contato bean) {
		dao.save(bean);
	}

	public void delete(Contato bean) {
		dao.delete(bean);
	}

	public List<Contato> select() {
		return dao.findAll();
	}

	public Contato select(long id) {
		
		return dao.findById(id);
	}
}
