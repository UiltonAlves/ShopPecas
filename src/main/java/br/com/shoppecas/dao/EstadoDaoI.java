package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Estado;

public interface EstadoDaoI extends JpaRepository<Estado, Long> {
	Estado findById(Long id);

}
