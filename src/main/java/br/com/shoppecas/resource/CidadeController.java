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

import br.com.shoppecas.models.Cidade;
import br.com.shoppecas.rni.CidadeBCI;


@RestController
@RequestMapping("/shopPecas")
public class CidadeController {
	
	@Autowired
	CidadeBCI cidadeControle;
		
	@GetMapping("/cidades")
	public List<Cidade> listaCidade(){
		return cidadeControle.select();
	}
	
	@GetMapping("/cidade/{id}")
	public Cidade buscarCidadeId(@PathVariable(value="id")long id){
		return cidadeControle.select(id);
	}

	@PostMapping("/cidade")
	public String salvaCidade(@RequestBody Cidade cidade) {
		cidadeControle.insert(cidade);
		return "Cidade Salvo com suscesso!!";
	}
	
	@DeleteMapping("/cidade")
	public String deletaCidade(@RequestBody Cidade cidade) {
		cidadeControle.delete(cidade);
	 return "Cidade Deletado com suscesso!!";
	}
	
	@PutMapping("/cidade")
	public String atualizaCidade(@RequestBody Cidade cidade) {
		cidadeControle.update(cidade);
	 return "Cidade Atualizado com suscesso!!";
	}
	
	
}
