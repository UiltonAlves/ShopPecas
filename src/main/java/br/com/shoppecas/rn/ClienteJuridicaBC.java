package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.ClienteJuridicaDaoI;
import br.com.shoppecas.models.ClienteJuridica;
import br.com.shoppecas.rni.ClienteJuridicaBCI;

@Controller
public class ClienteJuridicaBC implements ClienteJuridicaBCI{

	@Autowired
	private ClienteJuridicaDaoI dao;
	
	public void insert(ClienteJuridica bean) {
		dao.save(bean);
	}

	public void update(ClienteJuridica bean) {
		dao.save(bean);
	}

	public void delete(ClienteJuridica bean) {
		dao.delete(bean);
	}

	public List<ClienteJuridica> select() {
		return dao.findAll();
	}

	public ClienteJuridica select(long id) {
		
		return dao.findById(id);
	}
}
