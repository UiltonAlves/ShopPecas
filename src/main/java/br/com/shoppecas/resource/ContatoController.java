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

import br.com.shoppecas.models.Contato;
import br.com.shoppecas.rni.ContatoBCI;


@RestController
@RequestMapping("/shopPecas")
public class ContatoController {
	
	@Autowired
	ContatoBCI contatoControle;
		
	@GetMapping("/contatos")
	public List<Contato> listaContato(){
		return contatoControle.select();
	}
	
	@GetMapping("/contato/{id}")
	public Contato buscaContatoId(@PathVariable(value="id")long id){
		return contatoControle.select(id);
	}

	@PostMapping("/contato")
	public String salvaContato(@RequestBody Contato contato) {
		contatoControle.insert(contato);
		return "Contato Salvo com suscesso!!";
	}
	
	@DeleteMapping("/contato")
	public String deletaContato(@RequestBody Contato contato) {
		contatoControle.delete(contato);
	 return "Contato Deletado com suscesso!!";
	}
	
	@PutMapping("/contato")
	public String atualizaContato(@RequestBody Contato contato) {
		contatoControle.update(contato);
	 return "Contato Atualizado com suscesso!!";
	}
	
	
}
