package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.ProdutoDaoI;
import br.com.shoppecas.models.Produto;
import br.com.shoppecas.rni.ProdutoBCI;

@Controller
public class ProdutoBC implements ProdutoBCI{

	@Autowired
	private ProdutoDaoI dao;
	
	public void insert(Produto bean) {
		dao.save(bean);
	}

	public void update(Produto bean) {
		dao.save(bean);
	}

	public void delete(Produto bean) {
		dao.delete(bean);
	}

	public List<Produto> select() {
		return dao.findAll();
	}


	public Produto select(long id) {
		
		return dao.findById(id);
	}
}
