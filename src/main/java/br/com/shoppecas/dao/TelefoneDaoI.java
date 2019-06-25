package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Telefone;

public interface TelefoneDaoI extends JpaRepository<Telefone, Long> {
	Telefone findById(Long id);
}
