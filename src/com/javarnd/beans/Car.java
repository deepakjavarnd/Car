package com.javarnd.beans;

import java.io.Serializable;

/**
 * This Class Holds the information about Car.
 * 
 * @author
 */
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	private int carId;
	private String careName;
	private String carType;
	private String carColor;

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCareName() {
		return careName;
	}

	public void setCareName(String careName) {
		this.careName = careName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
