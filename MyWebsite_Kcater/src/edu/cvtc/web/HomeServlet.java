package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("<!DOCTYPE html>\n<html>\n<head>\n<title>My Website</title>\n</head>\n<body>\n");
		out.append("<header>\n<h1>Home</h1></header>\n\n");
		out.append("<nav>\n<a href='HomeServlet'>Home</a>\n<a href='AboutServlet'>About</a> <a href='ContactServlet'>Contact</a>\n</nav>\n");
		out.append("<div>");
		out.append("<p>Hello this is a simple website about me. I created it for my Java Web class and plan to continue to use it as an example of my capabilities in Software and Web Development</p>\n");
		out.append("<p>This website will include past projects, my resume, current projects, information about me as a person, and more as I come up with more to add.</p>");
		out.append("<h2>To Do List:</h2>\n<p>This is a list of what I plan to do on this website</p>\n<ul>\n<li>\nAdd pages for past projects, current projects, and resume</li>\n<li>Style website to look nicer</li>\n<li>Make contact page functional</li>\n</ul>\n");
		out.append("</div>\n");
		out.append("<footer>&copy; Copyright 2016 Katherine Cater</footer>\n");
		out.append("</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
