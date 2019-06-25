package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.ServidorEmailDaoI;
import br.com.shoppecas.models.ServidorEmail;
import br.com.shoppecas.rni.ServidorEmailBCI;

@Controller
public class ServidorEmailBC implements ServidorEmailBCI{

	@Autowired
	private ServidorEmailDaoI dao;
	
	public void insert(ServidorEmail email) {
		dao.save(email);
	}

	public void update(ServidorEmail email) {
		dao.save(email);
	}

	public void delete(ServidorEmail email) {
		dao.delete(email);
	}

	public List<ServidorEmail> select() {
		return dao.findAll();
	}

	public ServidorEmail selectAtivo(Boolean ativo) {
		
		return dao.findByAtivo(ativo);
	}
}
