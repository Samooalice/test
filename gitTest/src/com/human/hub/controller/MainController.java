package com.human.hub.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main.ghub")
public class MainController extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/main.jsp");
		
		rd.forward(req,  resp);
	}
}
