package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import authorbean.AuthorBean;
import db.DbConnection;

public class ResetPassUserModel {
	
	public boolean validateAuthorUserAndEmail(AuthorBean b)
	{
		try 
		{
			DbConnection d = new DbConnection();
			Statement ps = null;
			ResultSet rs=null;
			ps=d.DbConnection1();
			
			String user_name=b.getUsername();
			String email=b.getEmail();
			
			String sql = "SELECT COUNT(AUTHOR.USERNAME, AUTHOR.EMAIL) FROM AUTHOR_DETAILS WHERE AUTHOR.USERNAME='"+user_name+"' AND AUTHOR.EMAIL='"+email+"'";
    		rs=ps.executeQuery(sql);
    		
    		int count =0;
    		while(rs.next()){
				count = count + 1;
			}
		} catch (SQLException e) {
 			e.printStackTrace();
 		}
		return false;
	}
}