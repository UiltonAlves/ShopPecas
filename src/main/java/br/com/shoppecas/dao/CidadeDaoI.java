package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Cidade;

public interface CidadeDaoI extends JpaRepository<Cidade, Long> {
	Cidade findById(Long id);
}
