package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Dependente;

public interface DependenteDaoI extends JpaRepository<Dependente, Long> {
	Dependente findById(Long id);
}
