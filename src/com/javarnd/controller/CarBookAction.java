package com.javarnd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javarnd.beans.CarBookDTO;
import com.javarnd.beans.CarDTO;
import com.javarnd.beans.GenericCarBookDTO;
import com.javarnd.service.CarBookService;
import com.javarnd.service.CarBookServiceImpl;
import com.javarnd.service.CarService;
import com.javarnd.service.CarServiceImpl;

public class CarBookAction extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CarBookService service =null;
		CarBookDTO carBookDTO=null;
		GenericCarBookDTO genericCarBookDTO=null;
		carBookDTO=new CarBookDTO();
		carBookDTO.setCarName(req.getParameter("carName"));
		carBookDTO.setAcOrNonAc(req.getParameter("carType"));
		carBookDTO.setDuration(req.getParameter("days"));
		service=new CarBookServiceImpl();
		genericCarBookDTO=service.bookCar(carBookDTO);
		if(genericCarBookDTO!=null) {
			req.setAttribute("modelData", genericCarBookDTO);
			req.getRequestDispatcher("car_book_invoice.jsp").forward(req, res);
		}
		else {
			req.getRequestDispatcher("booking_error_page.jsp").forward(req, res);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
