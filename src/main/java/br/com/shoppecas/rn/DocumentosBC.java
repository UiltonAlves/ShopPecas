package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.DocumentosDaoI;
import br.com.shoppecas.models.Documentos;
import br.com.shoppecas.rni.DocumentosBCI;

@Controller
public class DocumentosBC implements DocumentosBCI{

	@Autowired
	private DocumentosDaoI dao;
	
	public void insert(Documentos bean) {
		dao.save(bean);
	}

	public void update(Documentos bean) {
		dao.save(bean);
	}

	public void delete(Documentos bean) {
		dao.delete(bean);
	}

	public List<Documentos> select() {
		return dao.findAll();
	}

	public Documentos select(long id) {
		
		return dao.findById(id);
	}
}
