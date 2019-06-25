package br.com.shoppecas.configuration;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.shoppecas.models.Usuario;
import br.com.shoppecas.rni.UsuarioBCI;


@Repository
@Transactional
@Configuration
public class ImplUserDetailsService implements UserDetailsService {
	
	@Autowired
	UsuarioBCI controle;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = controle.selectLogin(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario nao encontrado!");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getAtivo(), true, true, true, usuario.getAuthorities());
	}
}
