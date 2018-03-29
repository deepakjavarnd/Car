package com.javarnd.repository;

import java.util.List;
/**
 * This interface contains unimplemented method of Car Operation
 * and provide loose coupling
 * 
 * @author Deepak
 */
import com.javarnd.beans.CarBookDTO;

public interface CarBookRepository {
	public List<String> getAllCarName();

	public int bookCar(CarBookDTO carBookDTO);

}
