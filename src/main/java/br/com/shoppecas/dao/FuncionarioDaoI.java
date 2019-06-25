package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Funcionario;

public interface FuncionarioDaoI extends JpaRepository<Funcionario, Long> {
	Funcionario findById(Long id);
}
