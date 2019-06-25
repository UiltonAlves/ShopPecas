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

import br.com.shoppecas.models.Empresa;
import br.com.shoppecas.rni.EmpresaBCI;


@RestController
@RequestMapping("/shopPecas")
public class EmpresaController {
	
	@Autowired
	EmpresaBCI empresaControle;
		
	@GetMapping("/empresas")
	public List<Empresa> listaEmpresa(){
		return empresaControle.select();
	}
	
	@GetMapping("/empresa/{id}")
	public Empresa buscaEmpresaId(@PathVariable(value="id")long id){
		return empresaControle.select(id);
	}

	@PostMapping("/empresa")
	public String salvaEmpresa(@RequestBody Empresa empresa) {
		empresaControle.insert(empresa);
		return "Empresa Salvo com suscesso!!";
	}
	
	@DeleteMapping("/empresa")
	public String deletaEmpresa(@RequestBody Empresa empresa) {
		empresaControle.delete(empresa);
	 return "Empresa Deletado com suscesso!!";
	}
	
	@PutMapping("/empresa")
	public String atualizaEmpresa(@RequestBody Empresa empresa) {
		empresaControle.update(empresa);
	 return "Empresa Atualizado com suscesso!!";
	}
	
	
}
