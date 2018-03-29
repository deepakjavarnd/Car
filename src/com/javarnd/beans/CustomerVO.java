package com.javarnd.beans;

/**
 * This Class Holds the Value Object information of Customer and used to store Form data without Conversion
 * layer to other layer.
 * 
 * @author Deepak
 */
public class CustomerVO {

	private String customerId;
	private String customerName;
	private String customerContact;
	private String customerAddress;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
}
