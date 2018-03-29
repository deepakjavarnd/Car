package com.javarnd.service;

import java.util.ArrayList;
import java.util.List;
import com.javarnd.beans.CustomerBO;
import com.javarnd.beans.CustomerDTO;
import com.javarnd.repository.CustomerRepository;
import com.javarnd.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = null;

	@Override
	public int addNewCustomer(CustomerDTO customerDTO) {
		int flag = 0;
		CustomerBO customerBO = null;
		customerRepository = new CustomerRepositoryImpl();
		// Convert CarDTO to CarBo
		customerBO = new CustomerBO();
		customerBO.setCustomerId(customerDTO.getCustomerId());
		customerBO.setCustomerName(customerDTO.getCustomerName());
		customerBO.setCustomerContact(customerDTO.getCustomerContact());
		customerBO.setCustomerAddress(customerDTO.getCustomerAddress());
		flag = customerRepository.addNewCustomer(customerBO);
		return flag;
	}

	@Override
	public int deleteCustomerById(int id) {
		int flag = 0;

		customerRepository = new CustomerRepositoryImpl();
		flag = customerRepository.deleteCustomerById(id);
		return flag;
	}

	@Override
	public int updateCustomerDetailsById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeCustomerStatusById(int id) {
		int flag = 0;
		customerRepository = new CustomerRepositoryImpl();
		;
		flag = customerRepository.changeCustomerStatusById(id);
		return flag;
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		List<CustomerDTO> list = null;
		customerRepository = new CustomerRepositoryImpl();
		list = new ArrayList<CustomerDTO>();

		list = customerRepository.getAllCustomers();
		return list;
	}

}
