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

import br.com.shoppecas.models.Estado;
import br.com.shoppecas.rni.EstadoBCI;


@RestController
@RequestMapping("/shopPecas")
public class EstadoController {
	
	@Autowired
	EstadoBCI estadoControle;
		
	@GetMapping("/estados")
	public List<Estado> listaEmpresa(){
		return estadoControle.select();
	}
	
	@GetMapping("/estado/{id}")
	public Estado buscaEstadoId(@PathVariable(value="id")long id){
		return estadoControle.select(id);
	}

	@PostMapping("/estado")
	public String salvaEstado(@RequestBody Estado estado) {
		estadoControle.insert(estado);
		return "Estado Salvo com suscesso!!";
	}
	
	@DeleteMapping("/estado")
	public String deletaEstado(@RequestBody Estado estado) {
		estadoControle.delete(estado);
	 return "Estado Deletado com suscesso!!";
	}
	
	@PutMapping("/estado")
	public String atualizaEstado(@RequestBody Estado estado) {
		estadoControle.update(estado);
	 return "Estado Atualizado com suscesso!!";
	}
	
	
}
