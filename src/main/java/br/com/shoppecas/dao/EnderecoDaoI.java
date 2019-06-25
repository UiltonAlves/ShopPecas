package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Endereco;

public interface EnderecoDaoI extends JpaRepository<Endereco, Long> {
	Endereco findById(Long id);
}
