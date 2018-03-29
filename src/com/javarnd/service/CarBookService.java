package com.javarnd.service;

import java.util.List;

import com.javarnd.beans.CarBookDTO;
import com.javarnd.beans.GenericCarBookDTO;

public interface CarBookService {
	public List<String> getAllCarName();

	public GenericCarBookDTO bookCar(CarBookDTO carBookDTO);
}
