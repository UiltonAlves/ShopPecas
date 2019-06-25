package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Banco;

public interface BancoDaoI extends JpaRepository<Banco, Long> {
	Banco findById(Long id);
}
