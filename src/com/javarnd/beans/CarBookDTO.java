package com.javarnd.beans;

/**
 * This Class Holds the information about BookCar and used to transfer from one
 * layer to other layer.
 * 
 * @author Deepak
 */
public class CarBookDTO {
	private String carName;
	private String acOrNonAc;
	private String duration;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getAcOrNonAc() {
		return acOrNonAc;
	}

	public void setAcOrNonAc(String acOrNonAc) {
		this.acOrNonAc = acOrNonAc;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
