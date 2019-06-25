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

import br.com.shoppecas.models.Endereco;
import br.com.shoppecas.rni.EnderecoBCI;


@RestController
@RequestMapping("/shopPecas")
public class EnderecoController {
	
	@Autowired
	EnderecoBCI enderecoControle;
		
	@GetMapping("/enderecos")
	public List<Endereco> listaEndereco(){
		return enderecoControle.select();
	}
	
	@GetMapping("/endereco/{id}")
	public Endereco buscaEnderecoId(@PathVariable(value="id")long id){
		return enderecoControle.select(id);
	}

	@PostMapping("/endereco")
	public String salvaEndereco(@RequestBody Endereco endereco) {
		enderecoControle.insert(endereco);
		return "Endereco Salvo com suscesso!!";
	}
	
	@DeleteMapping("/endereco")
	public String deletaEndereco(@RequestBody Endereco endereco) {
		enderecoControle.delete(endereco);
	 return "Endereco Deletado com suscesso!!";
	}
	
	@PutMapping("/endereco")
	public String atualizaEndereco(@RequestBody Endereco endereco) {
		enderecoControle.update(endereco);
	 return "EnderecoAtualizado com suscesso!!";
	}
	
	
}
