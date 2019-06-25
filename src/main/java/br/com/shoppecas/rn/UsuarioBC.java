package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.UsuarioDaoI;
import br.com.shoppecas.models.Usuario;
import br.com.shoppecas.rni.UsuarioBCI;

@Controller
public class UsuarioBC implements UsuarioBCI{

	@Autowired
	private UsuarioDaoI dao;
	
	public void insert(Usuario usuario) {
		dao.save(usuario);
	}

	public void update(Usuario usuario) {
		dao.save(usuario);
	}

	public void delete(Usuario usuario) {
		dao.delete(usuario);
	}

	public List<Usuario> select() {
		
		return dao.findAll();
	}

	public Usuario selectLogin(String login) {
		
		return dao.findByUsername(login);
	}
}
