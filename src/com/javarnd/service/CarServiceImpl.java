package com.javarnd.service;

import java.util.ArrayList;
import java.util.List;

import com.javarnd.beans.CarBO;
import com.javarnd.beans.CarDTO;
import com.javarnd.repository.CarRepository;
import com.javarnd.repository.CarRepositoryImpl;

public class CarServiceImpl implements CarService {
	private CarRepository carRepository = null;

	@Override
	public int addNewCar(CarDTO carDTO) {
		int flag = 0;
		CarBO carBO = null;
		carRepository = new CarRepositoryImpl();
		// Convert CarDTO to CarBo
		carBO = new CarBO();
		carBO.setCarId(carDTO.getCarId());
		carBO.setCareName(carDTO.getCarName());
		carBO.setCarType(carDTO.getCarType());
		carBO.setCarColor(carDTO.getCarColor());
		flag = carRepository.addNewCar(carBO);
		return flag;
	}

	@Override
	public int deleteCarById(int id) {
		int flag = 0;
		carRepository = new CarRepositoryImpl();
		flag = carRepository.deleteCarById(id);
		return flag;
	}

	@Override
	public List<CarDTO> getAvailbleCars() {
		List<CarDTO> list = null;
		carRepository = new CarRepositoryImpl();
		list = new ArrayList<CarDTO>();

		list = carRepository.getAvailbleCars();
		return list;
	}

	@Override
	public int changeCarStatus(int id) {
		int flag = 0;
		carRepository = new CarRepositoryImpl();
		flag = carRepository.changeCarStatusById(id);
		return flag;
	}

}
