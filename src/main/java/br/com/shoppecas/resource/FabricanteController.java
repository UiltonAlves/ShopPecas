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

import br.com.shoppecas.models.Fabricante;
import br.com.shoppecas.rni.FabricanteBCI;

@RestController
@RequestMapping("/shopPecas")
public class FabricanteController {
	
	@Autowired
	FabricanteBCI fabricanteControle;
		
	@GetMapping("/fabricantes")
	public List<Fabricante> listaCategoria(){
		return fabricanteControle.select();
	}
	
	@GetMapping("/fabricante/{id}")
	public Fabricante buscaCategoriaProdutoId(@PathVariable(value="id")long id){
		return fabricanteControle.select(id);
	}

	@PostMapping("/fabricante")
	public String salvaFabricante(@RequestBody Fabricante fabricante) {
		fabricanteControle.insert(fabricante);
		return "Fabricante Salvo com suscesso!!";
	}
	
	@DeleteMapping("/fabricante")
	public String deletaCategoriaProduto(@RequestBody Fabricante fabricante) {
		fabricanteControle.delete(fabricante);
	 return "Fabricante Deletado com suscesso!!";
	}
	
	@PutMapping("/fabricante")
	public String atualizaCategoriaProduto(@RequestBody Fabricante fabricante) {
		fabricanteControle.update(fabricante);
	 return "Fabricante Atualizado com suscesso!!";
	}
	
	
}
