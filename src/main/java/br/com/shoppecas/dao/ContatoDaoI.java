package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Contato;

public interface ContatoDaoI extends JpaRepository<Contato, Long> {
	Contato findById(Long id);
}
