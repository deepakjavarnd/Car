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

public class GetAvailbleCarAction extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	CarService service=null;
	List<CarDTO> list=null;
	service=new CarServiceImpl();
	list=service.getAvailbleCars();
	if(list!=null) {
	req.setAttribute("list", list);
	req.getRequestDispatcher("show_availble_car.jsp").forward(req, res);
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
