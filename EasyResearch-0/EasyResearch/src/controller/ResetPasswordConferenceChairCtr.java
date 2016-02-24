package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ResetPasswordConferenceChairModel;
import conferencechairbean.ConferenceChairBean;

public class ResetPasswordConferenceChairCtr extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConferenceChairBean c = new ConferenceChairBean();
		
		String username= request.getParameter("resetPassUsername");
		String email = request.getParameter("resetPassEmailId");
		if("".equals(username)|| "".equals(email))
		{
			response.sendRedirect("ResetPassword.jsp");
		}
		else
		{
			
			c.setUsername(username);
			c.setEmail(email);
			ResetPasswordConferenceChairModel rc = new ResetPasswordConferenceChairModel();
		
			rc.checkPassword(c);
			response.sendRedirect("ConferenceChair.jsp");
		}
	}
}
