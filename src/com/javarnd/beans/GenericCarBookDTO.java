package com.javarnd.beans;

import java.io.Serializable;

/**
 * This Class Holds the Generic information for CarBook and used to transfer
 * from one layer to other layer.
 * 
 * @author Deepak
 */
public class GenericCarBookDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int bookId;
	private String carName;
	private long charge;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public long getCharge() {
		return charge;
	}

	public void setCharge(long charge) {
		this.charge = charge;
	}

}
