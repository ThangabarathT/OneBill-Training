package com.onebill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactForm
 */
@WebServlet("/ContactForm")
public class ContactForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String country = request.getParameter("country");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		String[] lang = request.getParameterValues("language");
		out.println("First Name : "+firstname+"<br><br>");
		out.println("Last Name  : "+lastname+"<br><br>");
		out.println("Country    : "+country+"<br><br>");
		out.println("Address    : "+address+"<br><br>");
		out.println("Contact No : "+contact+"<br><br>");
		out.println("Gender     : "+gender+"<br><br>");
		out.println("Favorite Programming Language : "+"<br><br>");
		for(String str:lang) {
			out.println(str+"<br><br>");
		}
	}

}
