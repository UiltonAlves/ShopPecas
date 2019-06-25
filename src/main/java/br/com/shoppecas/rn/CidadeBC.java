package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.CidadeDaoI;
import br.com.shoppecas.models.Cidade;
import br.com.shoppecas.rni.CidadeBCI;

@Controller
public class CidadeBC implements CidadeBCI{

	@Autowired
	private CidadeDaoI dao;
	
	public void insert(Cidade bean) {
		dao.save(bean);
	}

	public void update(Cidade bean) {
		dao.save(bean);
	}

	public void delete(Cidade bean) {
		dao.delete(bean);
	}

	public List<Cidade> select() {
		return dao.findAll();
	}

	public Cidade select(long id) {
		
		return dao.findById(id);
	}
}
