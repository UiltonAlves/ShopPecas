package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.BancoDaoI;
import br.com.shoppecas.models.Banco;
import br.com.shoppecas.rni.BancoBCI;

@Controller
public class BancoBC implements BancoBCI{

	@Autowired
	private BancoDaoI dao;
	
	public void insert(Banco bean) {
		dao.save(bean);
	}

	public void update(Banco bean) {
		dao.save(bean);
	}

	public void delete(Banco bean) {
		dao.delete(bean);
	}

	public List<Banco> select() {
		return dao.findAll();
	}

	public Banco select(long id) {
		
		return dao.findById(id);
	}
}
