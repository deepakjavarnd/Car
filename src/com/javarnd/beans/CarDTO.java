package com.javarnd.beans;

import java.io.Serializable;
/**
 * This Class Holds the information about Car and used to transfer from one
 * layer to other layer.
 * 
 * @author Deepak
 */
public class CarDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int carId;
	private String carName;
	private String carType;
	private String carColor;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CarDTO [carId=" + carId + ", carName=" + carName + ", carType=" + carType + ", carColor=" + carColor
				+ ", status=" + status + "]";
	}

}
