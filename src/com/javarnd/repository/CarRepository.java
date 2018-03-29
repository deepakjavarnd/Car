package com.javarnd.repository;

import java.util.List;

import com.javarnd.beans.Car;
import com.javarnd.beans.CarBO;
import com.javarnd.beans.CarDTO;

public interface CarRepository {
	public int addNewCar(CarBO car);

	public int deleteCarById(int id);

	public int updateCarDetailsById(int id);

	public int changeCarStatusById(int id);

	public List<CarDTO> getAvailbleCars();

	public List<Car> getBookedCar();
}
