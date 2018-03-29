package com.javarnd.service;

import java.util.List;
import com.javarnd.beans.CarDTO;

public interface CarService {
	public int addNewCar(CarDTO carDTO);

	public int deleteCarById(int id);

	public List<CarDTO> getAvailbleCars();

	public int changeCarStatus(int id);

}
