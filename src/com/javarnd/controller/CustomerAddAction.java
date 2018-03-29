package com.javarnd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.javarnd.beans.CustomerDTO;
import com.javarnd.service.CustomerService;
import com.javarnd.service.CustomerServiceImpl;

public class CustomerAddAction extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int flag=0;
		CustomerService service=null;
		CustomerDTO customerDTO=null;
		RequestDispatcher ds=null;
		//read form data and set CarDTO
		customerDTO=new CustomerDTO();
		customerDTO.setCustomerId(Integer.parseInt(req.getParameter("customerId")));
		customerDTO.setCustomerName(req.getParameter("customerName"));
		customerDTO.setCustomerContact(Long.parseLong(req.getParameter("customerContact")));
		customerDTO.setCustomerAddress(req.getParameter("customerAddress"));
		
		//Call Service Method
		service=new CustomerServiceImpl();
		flag =service.addNewCustomer(customerDTO);
		
		if(flag>0) {
			ds=req.getRequestDispatcher("success.jsp");
			ds.forward(req, res);
		}
		else
		{
			req.getRequestDispatcher("failed.jsp").forward(req, res);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
