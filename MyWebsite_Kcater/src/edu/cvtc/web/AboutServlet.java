package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/AboutServlet")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("<!DOCTYPE html>\n<html>\n<head>\n<title>My Website</title>\n</head>\n<body>\n");
		out.append("<header>\n<h1>About</h1></header>\n\n");
		out.append("<nav>\n<a href='HomeServlet'>Home</a> <a href='ContactServlet'>Contact</a>\n</nav>\n");
		out.append("<div>");
		out.append("<p>Text goes here</p>");
		out.append("");
		out.append("</div>\n");
		out.append("<footer>&copy; Copyright 2016 Katherine Cater</footer>\n");
		out.append("</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
