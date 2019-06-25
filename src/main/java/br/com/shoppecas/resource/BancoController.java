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

import br.com.shoppecas.models.Banco;
import br.com.shoppecas.rni.BancoBCI;


@RestController
@RequestMapping("/shopPecas")
public class BancoController {
	
	@Autowired
	BancoBCI bancoControle;
		
	@GetMapping("/bancos")
	public List<Banco> listaBanco(){
		return bancoControle.select();
	}
	
	@GetMapping("/banco/{id}")
	public Banco buscaBancoId(@PathVariable(value="id")long id){
		return bancoControle.select(id);
	}

	@PostMapping("/banco")
	public String salvaDadosBancario(@RequestBody Banco banco) {
		bancoControle.insert(banco);
		return "Dados Bancario Salvo com suscesso!!";
	}
	
	@DeleteMapping("/banco")
	public String deletaBanco(@RequestBody Banco banco) {
		bancoControle.delete(banco);
	 return "Dados Bancario Deletado com suscesso!!";
	}
	
	@PutMapping("/banco")
	public String atualizaBanco(@RequestBody Banco banco) {
		bancoControle.update(banco);
	 return "Dados Bancario Atualizado com suscesso!!";
	}
	
	
}
