package com.javarnd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javarnd.beans.CarDTO;
import com.javarnd.service.CarService;
import com.javarnd.service.CarServiceImpl;

public class CarAddAction extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int flag=0;
		CarService service=null;
		CarDTO carDTO=null;
		RequestDispatcher ds=null;
		//read form data and set CarDTO
		carDTO=new CarDTO();
		carDTO.setCarId(Integer.parseInt(req.getParameter("carId")));
		carDTO.setCarName(req.getParameter("carName"));
		carDTO.setCarType(req.getParameter("carType"));
		carDTO.setCarColor(req.getParameter("carColor"));
		
		//Call Service Method
		service=new CarServiceImpl();
		flag =service.addNewCar(carDTO);
		
		if(flag>0) {
			ds=req.getRequestDispatcher("success.jsp");
			ds.forward(req, res);
		}
		else {
			ds=req.getRequestDispatcher("failed.jsp");
			ds.forward(req, res);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
