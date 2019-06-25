package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.ClienteFisica;

public interface ClienteFisicaDaoI extends JpaRepository<ClienteFisica, Long> {
	ClienteFisica findById(Long id);
}
