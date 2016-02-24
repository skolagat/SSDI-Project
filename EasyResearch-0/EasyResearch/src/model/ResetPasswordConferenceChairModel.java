package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import conferencechairbean.ConferenceChairBean;
import controller.AutomaterEmailCtr;
import db.DbConnection;

public class ResetPasswordConferenceChairModel {
	
	public void checkPassword(ConferenceChairBean b){
	
		try {
			
			String password = null;
			
			DbConnection d = new DbConnection();
			Statement ps = null;
			ResultSet rs=null;
			
			String user_name=b.getUsername();
			String email=b.getEmail();
			
			String sql = "select password from login where username='"+user_name+"' and email='"+email+"'"; 
			ps=d.DbConnection2(sql);
			rs=ps.executeQuery(sql);
			
			while(rs.next()){
				password = rs.getString("password");	
			}
			
			b.setEmailsubject("EasyResearch Password");
			b.setEmailmessage("Your password is " + password);
			
			AutomaterEmailCtr a = new AutomaterEmailCtr();
			a.sendEmailMessage(b);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}