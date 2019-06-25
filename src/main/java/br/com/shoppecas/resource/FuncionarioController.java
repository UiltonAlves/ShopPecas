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

import br.com.shoppecas.models.Funcionario;
import br.com.shoppecas.rni.FuncionarioBCI;


@RestController
@RequestMapping("/shopPecas")
public class FuncionarioController {
	
	@Autowired
	FuncionarioBCI funcionarioControle;
		
	@GetMapping("/funcionarios")
	public List<Funcionario> listaFuncionario(){
		return funcionarioControle.select();
	}
	
	@GetMapping("/funcionario/{id}")
	public Funcionario buscaFuncionarioId(@PathVariable(value="id")long id){
		return funcionarioControle.select(id);
	}

	@PostMapping("/funcionario")
	public String salvaFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioControle.insert(funcionario);
		return "Funcionario Salvo com suscesso!!";
	}
	
	@DeleteMapping("/funcionario")
	public String deletaFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioControle.delete(funcionario);
	 return "Funcionario Deletado com suscesso!!";
	}
	
	@PutMapping("/funcionario")
	public String atualizaFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioControle.update(funcionario);
	 return "Funcionario Atualizado com suscesso!!";
	}
	
	
}
