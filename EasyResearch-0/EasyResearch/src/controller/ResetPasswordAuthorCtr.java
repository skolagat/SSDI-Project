package controller;

import java.io.IOException;
import authorbean.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ResetPasswordAuthorModel;

public class ResetPasswordAuthorCtr extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("inside post");
		AuthorBean a = new AuthorBean();
		String username= request.getParameter("resetPassUsername");
		String email = request.getParameter("resetPassEmailId");
		if("".equals(username)|| "".equals(email)){
			response.sendRedirect("ResetPassword.jsp");
		}
		else
		{
			a.setUsername(username);
			a.setEmail(email);
			System.out.println("received username"+username+"received email "+ email);
			System.out.println("calling model");
			ResetPasswordAuthorModel r = new ResetPasswordAuthorModel();
			r.checkPassword(a);
			response.sendRedirect("AuthorLogin.jsp");
		}
	}
}