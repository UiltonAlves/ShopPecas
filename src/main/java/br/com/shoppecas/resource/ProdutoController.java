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

import br.com.shoppecas.models.Produto;
import br.com.shoppecas.rni.ProdutoBCI;


@RestController
@RequestMapping("/shopPecas")
public class ProdutoController {
	
	@Autowired
	ProdutoBCI produtoControle;
		
	@GetMapping("/produtos")
	public List<Produto> listaProduto(){
		return produtoControle.select();
	}
	
	@GetMapping("/produto/{id}")
	public Produto buscaProdutoId(@PathVariable(value="id")long id){
		return produtoControle.select(id);
	}

	@PostMapping("/produto")
	public String salvaProduto(@RequestBody Produto produto) {
		produtoControle.insert(produto);
		return "Produto Salvo com suscesso!!";
	}
	
	@DeleteMapping("/produto")
	public String deletaProduto(@RequestBody Produto produto) {
		produtoControle.delete(produto);
	 return "Produto Deletado com suscesso!!";
	}
	
	@PutMapping("/produto")
	public String atualizaProduto(@RequestBody Produto produto) {
		produtoControle.update(produto);
	 return "Produto Atualizado com suscesso!!";
	}
	
	
}
