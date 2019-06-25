package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.ClienteJuridica;

public interface ClienteJuridicaDaoI extends JpaRepository<ClienteJuridica, Long> {
	ClienteJuridica findById(Long id);

}
