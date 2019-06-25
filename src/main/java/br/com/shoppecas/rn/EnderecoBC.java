package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.EnderecoDaoI;
import br.com.shoppecas.models.Endereco;
import br.com.shoppecas.rni.EnderecoBCI;

@Controller
public class EnderecoBC implements EnderecoBCI{

	@Autowired
	private EnderecoDaoI dao;
	
	public void insert(Endereco bean) {
		dao.save(bean);
	}

	public void update(Endereco bean) {
		dao.save(bean);
	}

	public void delete(Endereco bean) {
		dao.delete(bean);
	}

	public List<Endereco> select() {
		return dao.findAll();
	}

	public Endereco select(long id) {
		
		return dao.findById(id);
	}
}
