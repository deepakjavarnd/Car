package com.javarnd.repository;

import java.util.List;
import com.javarnd.beans.CustomerBO;
import com.javarnd.beans.CustomerDTO;

public interface CustomerRepository {
	public int addNewCustomer(CustomerBO customerBO);

	public int deleteCustomerById(int id);

	public int updateCustomerDetailsById(int id);

	public int changeCustomerStatusById(int id);

	public List<CustomerDTO> getAllCustomers();
}
