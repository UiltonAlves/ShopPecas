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

import br.com.shoppecas.models.CategoriaProduto;
import br.com.shoppecas.rni.CategoriaProdutoBCI;


@RestController
@RequestMapping("/shopPecas")
public class CategoriaProdutoController {
	
	@Autowired
	CategoriaProdutoBCI CategoriaProdutoControle;
		
	@GetMapping("/categorias")
	public List<CategoriaProduto> listaCategoria(){
		return CategoriaProdutoControle.select();
	}
	
	@GetMapping("/categoria/{id}")
	public CategoriaProduto buscaCategoriaProdutoId(@PathVariable(value="id")long id){
		return CategoriaProdutoControle.select(id);
	}

	@PostMapping("/categoria")
	public String salvaCategoriaProduto(@RequestBody CategoriaProduto categoria) {
		CategoriaProdutoControle.insert(categoria);
		return "Categoria Produto Salvo com suscesso!!";
	}
	
	@DeleteMapping("/categoria")
	public String deletaCategoriaProduto(@RequestBody CategoriaProduto categoria) {
		CategoriaProdutoControle.delete(categoria);
	 return "Categoria Produto Deletado com suscesso!!";
	}
	
	@PutMapping("/categoria")
	public String atualizaCategoriaProduto(@RequestBody CategoriaProduto categoria) {
		CategoriaProdutoControle.update(categoria);
	 return "Categoria Produto Atualizado com suscesso!!";
	}
	
	
}
