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

import br.com.shoppecas.models.DadosBancario;
import br.com.shoppecas.rni.DadosBancarioBCI;


@RestController
@RequestMapping("/shopPecas")
public class DadosBancarioController {
	
	@Autowired
	DadosBancarioBCI dadosBancarioControle;
		
	@GetMapping("/dadosbancarios")
	public List<DadosBancario> listaDadosBancario(){
		return dadosBancarioControle.select();
	}
	
	@GetMapping("/dadosbancario/{id}")
	public DadosBancario buscaDadosBancarioId(@PathVariable(value="id")long id){
		return dadosBancarioControle.select(id);
	}

	@PostMapping("/dadosbancario")
	public String salvaDadosBancario(@RequestBody DadosBancario dadosbancario) {
		dadosBancarioControle.insert(dadosbancario);
		return "Dados Bancario Salvo com suscesso!!";
	}
	
	@DeleteMapping("/dadosbancario")
	public String deletaDadosBancario(@RequestBody DadosBancario dadosbancario) {
		dadosBancarioControle.delete(dadosbancario);
	 return "Dados Bancario Deletado com suscesso!!";
	}
	
	@PutMapping("/dadosbancario")
	public String atualizaDadosBancario(@RequestBody DadosBancario dadosbancario) {
		dadosBancarioControle.update(dadosbancario);
	 return "Dados Bancario Atualizado com suscesso!!";
	}
	
	
}
