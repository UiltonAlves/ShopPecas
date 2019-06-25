package br.com.shoppecas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.shoppecas.models.Role;

public interface RoleDaoI extends JpaRepository<Role, Long> {
	Role findById(Long id);
}
