package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.FuncionarioDaoI;
import br.com.shoppecas.models.Funcionario;
import br.com.shoppecas.rni.FuncionarioBCI;

@Controller
public class FuncionarioBC implements FuncionarioBCI{

	@Autowired
	private FuncionarioDaoI dao;
	
	public void insert(Funcionario bean) {
		dao.save(bean);
	}

	public void update(Funcionario bean) {
		dao.save(bean);
	}

	public void delete(Funcionario bean) {
		dao.delete(bean);
	}

	public List<Funcionario> select() {
		return dao.findAll();
	}

	public Funcionario select(long id) {
		
		return dao.findById(id);
	}
}
