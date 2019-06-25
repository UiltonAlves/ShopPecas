package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.PaginaDaoI;
import br.com.shoppecas.models.Pagina;
import br.com.shoppecas.rni.PaginaBCI;

@Controller
public class PaginaBC implements PaginaBCI{

	@Autowired
	private PaginaDaoI dao;
	
	public void insert(Pagina pagina) {
		dao.save(pagina);
	}

	public void update(Pagina pagina) {
		dao.save(pagina);
	}

	public void delete(Pagina pagina) {
		dao.delete(pagina);
	}

	public List<Pagina> select() {
		return dao.findAll();
	}
}
