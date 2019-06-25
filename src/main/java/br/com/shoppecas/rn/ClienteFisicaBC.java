package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.ClienteFisicaDaoI;
import br.com.shoppecas.models.ClienteFisica;
import br.com.shoppecas.rni.ClienteFisicaBCI;

@Controller
public class ClienteFisicaBC implements ClienteFisicaBCI{

	@Autowired
	private ClienteFisicaDaoI dao;
	
	public void insert(ClienteFisica bean) {
		dao.save(bean);
	}

	public void update(ClienteFisica bean) {
		dao.save(bean);
	}

	public void delete(ClienteFisica bean) {
		dao.delete(bean);
	}

	public List<ClienteFisica> select() {
		return dao.findAll();
	}

	public ClienteFisica select(long id) {
		
		return dao.findById(id);
	}
}
