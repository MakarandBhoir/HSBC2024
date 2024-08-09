package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestApiServlet")
public class TestApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestApiServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// cross origin resource sharing
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");
		String jsonData = "{\"message\":\"Welcome To World of Api!!!\"}";
		PrintWriter out = response.getWriter();
		out.println(jsonData);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
