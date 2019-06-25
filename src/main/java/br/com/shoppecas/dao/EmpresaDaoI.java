package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Empresa;

public interface EmpresaDaoI extends JpaRepository<Empresa, Long> {
	Empresa findById(Long id);
}
