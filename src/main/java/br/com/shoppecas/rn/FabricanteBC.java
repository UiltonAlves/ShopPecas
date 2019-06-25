package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.FabricanteDaoI;
import br.com.shoppecas.models.Fabricante;
import br.com.shoppecas.rni.FabricanteBCI;

@Controller
public class FabricanteBC implements FabricanteBCI{

	@Autowired
	private FabricanteDaoI dao;
	
	public void insert(Fabricante bean) {
		dao.save(bean);
	}

	public void update(Fabricante bean) {
		dao.save(bean);
	}

	public void delete(Fabricante bean) {
		dao.delete(bean);
	}

	public List<Fabricante> select() {
		return dao.findAll();
	}

	public Fabricante select(long id) {
		
		return dao.findById(id);
	}
}
