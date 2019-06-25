package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.CategoriaProduto;

public interface CategoriaProdutoDaoI extends JpaRepository<CategoriaProduto, Long> {
	CategoriaProduto findById(Long id);

}
