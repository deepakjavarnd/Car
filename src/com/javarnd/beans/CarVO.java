package com.javarnd.beans;

/**
 * This Class Holds the Value Object Information and used to directly store the form data without conversion
 * layer to other layer.
 * 
 * @author Deepak
 */
public class CarVO {
	private String carId;

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
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

	private String careName;
	private String carType;
	private String carColor;
}
