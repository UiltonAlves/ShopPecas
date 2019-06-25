package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Documentos;

public interface DocumentosDaoI extends JpaRepository<Documentos, Long> {
	Documentos findById(Long id);
}
