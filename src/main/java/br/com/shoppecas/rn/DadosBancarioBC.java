package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.DadosBancarioDaoI;
import br.com.shoppecas.models.DadosBancario;
import br.com.shoppecas.rni.DadosBancarioBCI;

@Controller
public class DadosBancarioBC implements DadosBancarioBCI{

	@Autowired
	private DadosBancarioDaoI dao;
	
	public void insert(DadosBancario bean) {
		dao.save(bean);
	}

	public void update(DadosBancario bean) {
		dao.save(bean);
	}

	public void delete(DadosBancario bean) {
		dao.delete(bean);
	}

	public List<DadosBancario> select() {
		return dao.findAll();
	}

	public DadosBancario select(long id) {
		
		return dao.findById(id);
	}
}
