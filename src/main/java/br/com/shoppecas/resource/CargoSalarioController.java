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

import br.com.shoppecas.models.CargoSalario;
import br.com.shoppecas.rni.CargoSalarioBCI;


@RestController
@RequestMapping("/shopPecas")
public class CargoSalarioController {
	
	@Autowired
	CargoSalarioBCI cargoSalarioControle;
		
	@GetMapping("/cargoSalarios")
	public List<CargoSalario> listaCargoSalario(){
		return cargoSalarioControle.select();
	}
	
	@GetMapping("/cargoSalario/{id}")
	public CargoSalario buscaCargoSalarioId(@PathVariable(value="id")long id){
		return cargoSalarioControle.select(id);
	}

	@PostMapping("/cargoSalario")
	public String salvaCargoSalario(@RequestBody CargoSalario cargoSalario) {
		cargoSalarioControle.insert(cargoSalario);
		return "Cargo Salario Salvo com suscesso!!";
	}
	
	@DeleteMapping("/cargoSalario")
	public String deletaCargoSalario(@RequestBody CargoSalario cargoSalario) {
		cargoSalarioControle.delete(cargoSalario);
	 return "Cargo Salario Deletado com suscesso!!";
	}
	
	@PutMapping("/cargoSalario")
	public String atualizaCargoSalario(@RequestBody CargoSalario cargoSalario) {
		cargoSalarioControle.update(cargoSalario);
	 return "Cargo Salario Atualizado com suscesso!!";
	}
	
	
}
