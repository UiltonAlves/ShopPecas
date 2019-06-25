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

import br.com.shoppecas.models.Dependente;
import br.com.shoppecas.rni.DependenteBCI;


@RestController
@RequestMapping("/shopPecas")
public class DependenteController {
	
	@Autowired
	DependenteBCI dependenteControle;
		
	@GetMapping("/dependentes")
	public List<Dependente> listaDependente(){
		return dependenteControle.select();
	}
	
	@GetMapping("/dependente/{id}")
	public Dependente buscaDependenteId(@PathVariable(value="id")long id){
		return dependenteControle.select(id);
	}

	@PostMapping("/dependente")
	public String salvaDependente(@RequestBody Dependente dependente) {
		dependenteControle.insert(dependente);
		return "Dependente Salvo com suscesso!!";
	}
	
	@DeleteMapping("/dependente")
	public String deletaDependente(@RequestBody Dependente dependente) {
		dependenteControle.delete(dependente);
	 return "Dependente Deletado com suscesso!!";
	}
	
	@PutMapping("/dependente")
	public String atualizaDependente(@RequestBody Dependente dependente) {
		dependenteControle.update(dependente);
	 return "Dependente Atualizado com suscesso!!";
	}
}
