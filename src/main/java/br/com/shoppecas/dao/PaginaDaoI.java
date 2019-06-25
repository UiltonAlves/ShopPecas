package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Pagina;

public interface PaginaDaoI extends JpaRepository<Pagina, Long> {
	Pagina findById(Long id);
}
