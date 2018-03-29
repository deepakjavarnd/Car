package com.javarnd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javarnd.beans.CarDTO;
import com.javarnd.service.CarService;
import com.javarnd.service.CarServiceImpl;

public class CarDeleteAction extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	CarService service=null;
	int flag=0;
	service=new CarServiceImpl();
	flag=service.deleteCarById(Integer.parseInt(req.getParameter("id")));
	if(flag>0) {
		List<CarDTO> list=null;
		service=new CarServiceImpl();
		list=service.getAvailbleCars();
		System.out.println(list);
		req.setAttribute("list", list);
		req.getRequestDispatcher("show_availble_car.jsp").forward(req, res);
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
