package controller;
import java.io.IOException;
import authorbean.*;
import conferencechairbean.*;
import reviewerbean.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ResetPasswordAuthorModel;
public class ResetPasswordUserCtr extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
			ResetPasswordAuthorModel r = new ResetPasswordAuthorModel();
			r.checkPassword(a);
			response.sendRedirect("AuthorLogin.jsp");
		}
	}

}
