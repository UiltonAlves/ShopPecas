package br.com.shoppecas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.shoppecas.models.ClienteJuridica;
import br.com.shoppecas.rni.ClienteJuridicaBCI;


@RestController
@RequestMapping("/shopPecas")
public class ClienteJuridicaController {
	
	@Autowired
	ClienteJuridicaBCI clienteJuridicaControle;
		
	@GetMapping("/clienteJuridicas")
	public List<ClienteJuridica> listaClienteJuridica(){
		return clienteJuridicaControle.select();
	}
	
	@GetMapping("/clienteJuridica/{id}")
	public ClienteJuridica buscaClienteJuridicaId(@PathVariable(value="id")long id){
		return clienteJuridicaControle.select(id);
	}

	@PostMapping("/clienteJuridica")
	public String salvaClienteJuridica(@RequestBody ClienteJuridica clienteJuridica) {
		clienteJuridicaControle.insert(clienteJuridica);
		return "Cliente Salvo com suscesso!!";
	}
	
	@DeleteMapping("/clienteJuridica")
	public String deletaClienteJuridica(@RequestBody ClienteJuridica clienteJuridica) {
		clienteJuridicaControle.delete(clienteJuridica);
	 return "Cliente Deletado com suscesso!!";
	}
	
	@PutMapping("/clienteJuridica")
	public String atualizaClienteJuridica(@RequestBody ClienteJuridica clienteJuridica) {
		clienteJuridicaControle.update(clienteJuridica);
	 return "Cliente Atualizado com suscesso!!";
	}
	
	
}
