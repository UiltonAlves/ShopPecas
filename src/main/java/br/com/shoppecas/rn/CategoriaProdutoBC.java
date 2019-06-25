package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.CategoriaProdutoDaoI;
import br.com.shoppecas.models.CategoriaProduto;
import br.com.shoppecas.rni.CategoriaProdutoBCI;

@Controller
public class CategoriaProdutoBC implements CategoriaProdutoBCI{

	@Autowired
	private CategoriaProdutoDaoI dao;
	
	public void insert(CategoriaProduto bean) {
		dao.save(bean);
	}

	public void update(CategoriaProduto bean) {
		dao.save(bean);
	}

	public void delete(CategoriaProduto bean) {
		dao.delete(bean);
	}

	public List<CategoriaProduto> select() {
		return dao.findAll();
	}

	public CategoriaProduto select(long id) {
		
		return dao.findById(id);
	}
}
