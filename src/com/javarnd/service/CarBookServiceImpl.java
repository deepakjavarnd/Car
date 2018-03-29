package com.javarnd.service;

import java.util.List;
import java.util.Random;

import com.javarnd.beans.CarBookDTO;
import com.javarnd.beans.GenericCarBookDTO;
import com.javarnd.repository.CarBookRepository;
import com.javarnd.repository.CarBookRepositoryImpl;
import com.javarnd.util.UtilConstants;

public class CarBookServiceImpl implements CarBookService {
	private CarBookRepository carBookRepository = null;

	@Override
	public List<String> getAllCarName() {
		List<String> carName = null;
		carBookRepository = new CarBookRepositoryImpl();
		carName = carBookRepository.getAllCarName();
		// TODO Auto-generated method stub
		return carName;
	}

	@Override
	public GenericCarBookDTO bookCar(CarBookDTO carBookDTO) {
		int flag = 0;
		GenericCarBookDTO genericCarBookDTO = null;
		carBookRepository = new CarBookRepositoryImpl();
		Random orderNo = null;
		flag = carBookRepository.bookCar(carBookDTO);
		if (flag > 0) {
			genericCarBookDTO = new GenericCarBookDTO();
			orderNo = new Random();
			genericCarBookDTO.setBookId(orderNo.nextInt(1000));
			genericCarBookDTO.setCarName(carBookDTO.getCarName());
			genericCarBookDTO.setCharge(UtilConstants.BASE_CHARGE + UtilConstants.AC_CHARGE);
		}
		return genericCarBookDTO;
	}

}
