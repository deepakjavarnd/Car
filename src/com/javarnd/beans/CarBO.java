package com.javarnd.beans;

/**
 * This Class holds the Business Object Data for Car.
 * 
 * @author Deepak
 */
public class CarBO {
	private int carId;
	private String careName;
	private String carType;
	private String carColor;

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

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
}
