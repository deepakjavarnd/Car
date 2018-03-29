package com.javarnd.beans;

import java.io.Serializable;
/**
 * This Class Holds the information about Customer and used to transfer from one
 * layer to other layer.
 * 
 * @author Deepak
 */
public class CustomerDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer customerId;
	private String customerName;
	private long customerContact;
	private String customerAddress;
	private String customerStatus;

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(Long customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
