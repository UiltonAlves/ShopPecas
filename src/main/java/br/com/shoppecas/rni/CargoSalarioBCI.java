package br.com.shoppecas.rni;

import java.util.List;

import br.com.shoppecas.models.CargoSalario;

public interface CargoSalarioBCI {
	
	public void insert(CargoSalario bean);
	public void update(CargoSalario bean);
	public void delete(CargoSalario bean);
	public CargoSalario select(long id);
	public List<CargoSalario> select();

}
