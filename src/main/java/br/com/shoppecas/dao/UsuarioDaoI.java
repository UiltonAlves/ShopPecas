package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Usuario;

public interface UsuarioDaoI extends JpaRepository<Usuario, Long> {
	Usuario findById(Long id);
	Usuario findByUsername(String login);

}
