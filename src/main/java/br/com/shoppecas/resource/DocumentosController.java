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

import br.com.shoppecas.models.Documentos;
import br.com.shoppecas.rni.DocumentosBCI;


@RestController
@RequestMapping("/shopPecas")
public class DocumentosController {
	
	@Autowired
	DocumentosBCI documentosControle;
		
	@GetMapping("/documentos")
	public List<Documentos> listaDocumentos(){
		return documentosControle.select();
	}
	
	@GetMapping("/documento/{id}")
	public Documentos buscaDocumentosId(@PathVariable(value="id")long id){
		return documentosControle.select(id);
	}

	@PostMapping("/documento")
	public String salvaDocumentos(@RequestBody Documentos documentos) {
		documentosControle.insert(documentos);
		return "Documentos Salvo com suscesso!!";
	}
	
	@DeleteMapping("/documento")
	public String deletaDocumentos(@RequestBody Documentos documentos) {
		documentosControle.delete(documentos);
	 return "Documentos Deletado com suscesso!!";
	}
	
	@PutMapping("/documento")
	public String atualizaDocumentos(@RequestBody Documentos documentos) {
		documentosControle.update(documentos);
	 return "Documentos Atualizado com suscesso!!";
	}
}
