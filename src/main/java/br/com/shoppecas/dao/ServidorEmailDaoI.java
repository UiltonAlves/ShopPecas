package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.ServidorEmail;
import br.com.shoppecas.models.Usuario;

public interface ServidorEmailDaoI extends JpaRepository<ServidorEmail, Long> {
		Usuario findById(Long id);
		ServidorEmail findByAtivo(Boolean ativo);
}
