package br.com.shoppecas.rn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.shoppecas.dao.CargoSalarioDaoI;
import br.com.shoppecas.models.CargoSalario;
import br.com.shoppecas.rni.CargoSalarioBCI;

@Controller
public class CargoSalarioBC implements CargoSalarioBCI{

	@Autowired
	private CargoSalarioDaoI dao;
	
	public void insert(CargoSalario bean) {
		dao.save(bean);
	}

	public void update(CargoSalario bean) {
		dao.save(bean);
	}

	public void delete(CargoSalario bean) {
		dao.delete(bean);
	}

	public List<CargoSalario> select() {
		return dao.findAll();
	}

	public CargoSalario select(long id) {
		
		return dao.findById(id);
	}
}
