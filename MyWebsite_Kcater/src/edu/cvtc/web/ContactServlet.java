package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("<!DOCTYPE html>\n<html>\n<head>\n<title>My Website</title>\n</head>\n<body>\n");
		out.append("<header>\n<h1>Contact Form</h1></header>\n\n");
		out.append("<nav>\n<a href='HomeServlet'>Home</a> <a href='AboutServlet'>About</a>\n<a href='ContactServlet'>Contact</a>\n</nav>\n");
		out.append("<div>\n");
		out.append("<form method=\"post\" action=#>\n<fieldset>\n");		
		out.append("<label for=\"first_name\">First Name</label>\n<input placeholder=\"Someone\" type=\"text\" name=\"first_name\">\n");
		out.append("<label for=\"last_name\">Last Name</label>\n<input placeholder=\"Anybody\" type=\"text\" name=\"last_name\">\n");
		out.append("<label for=\"email\">Email</label>\n<input placeholder=\"someone@somewhere.com\" type=\"email\" name=\"email\">\n");
		out.append("<label for=\"the_message\">Message</label>\n<textarea name=\"the_message\"></textarea>\n");
		out.append("<input type=\"submit\" value=\"Send Message\">\n</form>\n</div>\n");
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
