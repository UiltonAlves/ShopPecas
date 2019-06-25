package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Produto;

public interface ProdutoDaoI extends JpaRepository<Produto, Long> {
	
	
	Produto findById(Long id);

}
