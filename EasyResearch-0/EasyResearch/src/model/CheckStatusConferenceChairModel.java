package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conferencechairbean.ConferenceChairBean;
import db.DbConnection;
public class CheckStatusConferenceChairModel {
	
	public ConferenceChairBean doCheckStatus(ConferenceChairBean c){
		ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
		try {
			
			DbConnection d = new DbConnection();
			Statement ps = null;
			ResultSet rs=null;
			ps=d.DbConnection1();
			
			String sql = "select * from abstract inner join listofconferences on abstract.conferenceid = listofconferences.id where status='underreview'";
			rs=ps.executeQuery(sql);
			while(rs.next())
			{
				ArrayList<String> singleRecordArray = new ArrayList<String>();
				singleRecordArray.add(rs.getString("conferencename"));
				singleRecordArray.add(rs.getString("authorusername"));
				singleRecordArray.add(rs.getString("title"));
				singleRecordArray.add(rs.getString("keywords"));
				singleRecordArray.add(rs.getString("abstract"));
				singleRecordArray.add(rs.getString("id"));
				a.add(singleRecordArray);
				
			}
			ps.close();
			c.setAbstract_details(a);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public ConferenceChairBean doSaveStatus(ConferenceChairBean b){
		
		
		try {
			
			DbConnection d = new DbConnection();
			Statement ps = null;
			ps=d.DbConnection1();
			
			String abstractId = b.getAbstractId();
			String conferencename=b.getConferencename().trim();
			String title=b.getTitle().trim();
			String keyword=b.getKeywords().trim();
			String abstract_paper=b.getAbstract_paper().trim();
			String username=b.getAuthorusername().trim();
			String status=b.getStatus().trim();
			
			String sql="update abstract set status='"+status+"' where authorusername='"+username+"' and id='"+abstractId+"'";
			ps.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return b;
	}
}