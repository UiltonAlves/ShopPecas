package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.CargoSalario;

public interface CargoSalarioDaoI extends JpaRepository<CargoSalario, Long> {
	CargoSalario findById(Long id);
}
