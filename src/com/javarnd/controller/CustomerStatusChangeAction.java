package com.javarnd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javarnd.beans.CarDTO;
import com.javarnd.beans.CustomerDTO;
import com.javarnd.service.CarService;
import com.javarnd.service.CarServiceImpl;
import com.javarnd.service.CustomerService;
import com.javarnd.service.CustomerServiceImpl;

public class CustomerStatusChangeAction extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	CustomerService service=null;
	int flag=0;
	service=new CustomerServiceImpl();
	flag=service.changeCustomerStatusById(Integer.parseInt(req.getParameter("id")));
	if(flag>0) {
		List<CustomerDTO> list=null;
		list=service.getAllCustomers();
		System.out.println(list);
		req.setAttribute("list", list);
		req.getRequestDispatcher("show_all_customer.jsp").forward(req, res);
		}
	else {
		req.getRequestDispatcher("failed.jsp").forward(req, res);
	}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
