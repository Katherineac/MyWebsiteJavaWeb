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
		out.append("<nav>\n<a href='HomeServlet'>Home</a>\n<a href='AboutServlet'>About</a>\n<a href='ContactServlet'>Contact</a>\n</nav>\n");
		out.append("<div>\n<h2>About Katie</h2>\n");
		out.append("<p>Hello, my name is Katie and this section is about me. Here I will share a little bit about me and what I like to do. As I go on I will expand this further to include more about my work experience, school experience, and volunteer experience.</p>\n");
		out.append("<p>I am 24 years old, I live in Eau Claire, where I was born and raised. I went to Memorial High School then on to UWEC. After graduating from UWEC I applied ot graduate school for school psychology. Unfortunately I did not get in, so I chose to go back to school at CVTC for Software Development</p>\n");
		out.append("<p>I love to read pretty much anything fiction. My two favorite shows are Criminal Minds and Futurama. I am currently finishing up watching The X-Files. I enjoy music as well. I volunteer with Special Olympics twice a week during the school year. This is my 5th consecutive year volunteering. It's an absolute pleasure. I work with middle school students from South, Northstar, Delong, and Altoona middle schools.</p>\n");
		out.append("<p>More to come, feel free to contact me with suggestions.</p>");
		out.append("<p>Note: The contact form is not yet functional as of 04/02/2016.");
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
