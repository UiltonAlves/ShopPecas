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

import br.com.shoppecas.models.ClienteFisica;
import br.com.shoppecas.rni.ClienteFisicaBCI;


@RestController
@RequestMapping("/shopPecas")
public class ClienteFisicaController {
	
	@Autowired
	ClienteFisicaBCI clienteFisicaControle;
		
	@GetMapping("/clienteFisicas")
	public List<ClienteFisica> listaClienteFisica(){
		return clienteFisicaControle.select();
	}
	
	@GetMapping("/clienteFisica/{id}")
	public ClienteFisica buscaClienteFisicaId(@PathVariable(value="id")long id){
		return clienteFisicaControle.select(id);
	}

	@PostMapping("/clienteFisica")
	public String salvaClienteFisica(@RequestBody ClienteFisica clienteFisica) {
		clienteFisicaControle.insert(clienteFisica);
		return "Cliente Salvo com suscesso!!";
	}
	
	@DeleteMapping("/clienteFisica")
	public String deletaClienteFisica(@RequestBody ClienteFisica clienteFisica) {
		clienteFisicaControle.delete(clienteFisica);
	 return "Cliente Deletado com suscesso!!";
	}
	
	@PutMapping("/clienteFisica")
	public String atualizaClienteFisica(@RequestBody ClienteFisica clienteFisica) {
		clienteFisicaControle.update(clienteFisica);
	 return "Cliente Atualizado com suscesso!!";
	}
	
	
}
