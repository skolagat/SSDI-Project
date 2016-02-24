package controller;
import java.io.IOException;
import reviewerbean.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ResetPasswordReviewerModel;

public class ResetPasswordReviewerCtr extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ReviewerBean a = new ReviewerBean();
		String username= request.getParameter("resetPassUsername");
		String email = request.getParameter("resetPassEmailId");
		if("".equals(username)|| "".equals(email)){
			response.sendRedirect("ResetPasswordReviewer.jsp");
		}
		else
		{
			a.setUsername(username);
			a.setEmail(email);
			ResetPasswordReviewerModel r = new ResetPasswordReviewerModel();
			r.checkPassword(a);
			response.sendRedirect("ReviewerLogin.jsp");
		}
	}

}
