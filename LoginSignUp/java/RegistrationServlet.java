package com.iss.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upass = request.getParameter("pass");
		String repass = request.getParameter("re_pass");
		String umobile = request.getParameter("contact");
		
		RequestDispatcher dispatcher = null;
		Connection connection = null;
		
		//server side validation
		if(uname==null || uname.equals("")) {
			request.setAttribute("status", "InvalidName");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);

		}
		
		if(uemail==null || uemail.equals("")) {
			request.setAttribute("status", "InvalidEmail");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);

		}
		
		if(upass==null || upass.equals("")) {
			request.setAttribute("status", "InvalidPassword");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);

		}else if(! upass.equals(repass)) {
			request.setAttribute("status", "InvalidConfirmPassword");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}

		if(umobile==null || umobile.equals("")) {
			request.setAttribute("status", "InvalidMobile");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);

		}else if(umobile.length()>10 || umobile.length()<10){
			request.setAttribute("status", "InvalidMobileLength");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);

		}
//		PrintWriter out = response.getWriter();
//		out.println(uname);
//		out.println(uemail);
//		out.println(upass);
//		out.println(umobile);
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false", "root", "Shubham2003@@");
			PreparedStatement prepst = connection.prepareStatement("insert into users(uname, upass, uemail, umobile) values(?,?,?,?)");
			
			prepst.setString(1, uname);
			prepst.setString(2, upass);
			prepst.setString(3, uemail);
			prepst.setString(4, umobile);
			
			dispatcher = request.getRequestDispatcher("registration.jsp");
			int rowAffected = prepst.executeUpdate();
			
			
			if(rowAffected > 0) {
				request.setAttribute("stutus", "success");
			}else {
				request.setAttribute("stutus", "failed");
			}
			
			dispatcher.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
