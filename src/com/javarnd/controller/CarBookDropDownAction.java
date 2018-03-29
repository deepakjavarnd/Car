package com.javarnd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javarnd.service.CarBookService;
import com.javarnd.service.CarBookServiceImpl;
public class CarBookDropDownAction extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	CarBookService service=null;
	List<String> carName=null;
	service=new CarBookServiceImpl();
	carName=service.getAllCarName();
	if(carName!=null) {
		req.setAttribute("carName",carName);
		req.getRequestDispatcher("book_car.jsp").forward(req, res);
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
