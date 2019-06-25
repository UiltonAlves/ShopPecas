package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Fabricante;

public interface FabricanteDaoI extends JpaRepository<Fabricante, Long> {
	
	
	Fabricante findById(Long id);

}
