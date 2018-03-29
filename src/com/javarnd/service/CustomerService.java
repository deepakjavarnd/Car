package com.javarnd.service;

import java.util.List;

import com.javarnd.beans.CustomerDTO;

public interface CustomerService {
	public int addNewCustomer(CustomerDTO customerDTO);

	public int deleteCustomerById(int id);

	public int updateCustomerDetailsById(int id);

	public int changeCustomerStatusById(int id);

	public List<CustomerDTO> getAllCustomers();

}
