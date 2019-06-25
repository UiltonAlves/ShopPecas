package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.DadosBancario;

public interface DadosBancarioDaoI extends JpaRepository<DadosBancario, Long> {
	DadosBancario findById(Long id);
}
