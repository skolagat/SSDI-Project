package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import conferencechairbean.ConferenceChairBean;
import authorbean.AuthorBean;
import db.DbConnection;
import conferencebean.ConferenceBean;
public class ListofConferencesModel {
	
	java.util.Date adate;
	java.util.Date pdate;
	java.util.Date cdate;
	
	public AuthorBean doListofConferences(){
		
		String chairusername;
		
		ArrayList<ArrayList<String>> listofconferences = new ArrayList<ArrayList<String>>();
		AuthorBean a = new AuthorBean();
		ConferenceChairBean c = new ConferenceChairBean();
		UserDetailModel u = new UserDetailModel();
		CreateConferenceModel m = new CreateConferenceModel();
		
		long time = System.currentTimeMillis();
		java.util.Date date  = new java.util.Date(time);
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		
		try 
		{
			ResultSet rs=null;
			rs=m.getCountofConferences();
			
			while(rs.next()){
				String date1=rs.getString("abstract_date");
				try 
				{
					adate = s.parse(date1);
					 
					if(adate.compareTo(date)>0){
						ArrayList<String> conference = new ArrayList<String>();
						conference.add(rs.getString("conferencename"));
						conference.add(rs.getString("place"));
						chairusername=rs.getString("chairusername");
						c.setUsername(chairusername);
						conference.add(u.getUserEmail(c));
						conference.add(rs.getString("description"));
						
						String date2=rs.getString("paper_date");
						String date3 = rs.getString("conference_date");
					
						pdate = s.parse(date2);
						cdate = s.parse(date3);
						listofconferences.add(conference);						
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}
		
		a.setConferencelist(listofconferences);
		return a;
	}
	
	public AuthorBean doSaveListofConferences(AuthorBean b){
		
		long time = System.currentTimeMillis();
		Date date = new Date(time);
		
		
		try 
		{
			DbConnection d = new DbConnection();
			Statement ps = null;
			ResultSet rs = null;
			ps=d.DbConnection1();
			String id = "";
			
			String dateString= new SimpleDateFormat("yyyy-MM-dd").format(date);
			
			String sql = "select id from listofconferences where conferencename= '"+b.getConferencename()+"'";
			rs=ps.executeQuery(sql);
			
			while(rs.next()){
				id = rs.getString("id");
			}
			
			String sql1 = "select * from abstract";
			rs=ps.executeQuery(sql1);
			
			int countabstract=0;
			while(rs.next()){
				countabstract++;
			}
			countabstract++;
			
			String sql2 = "insert into abstract values('"+countabstract+"','"+id+"','"+b.getUsername()+"','"+b.getTitle()+"','"+b.getKeyword()+"','"+b.getAabstract()+"','underreview','','"+dateString+"')";
			ps.executeUpdate(sql2);
			
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;		
	}
	
	public HashMap<String,Date> doGetDates(){
		HashMap<String,Date> h = new HashMap<String,Date>();
		try 
		{
			DbConnection d = new DbConnection();
			Statement ps = null;
			ResultSet rs = null;
			ps=d.DbConnection1();
			rs=ps.executeQuery("select * from abstract");
			while(rs.next()){
				try 
				{
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
					java.util.Date date = sdf1.parse(rs.getString("date_submitted"));
					java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
					
					h.put(rs.getString("authorusername"), sqlStartDate);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return h;
	}

	public ConferenceBean getListofConferencesonHome(){
		
		String chairusername;
		
		ArrayList<ArrayList<String>> listofconferences = new ArrayList<ArrayList<String>>();
		ConferenceBean a = new ConferenceBean();
		ConferenceChairBean c = new ConferenceChairBean();
		UserDetailModel u = new UserDetailModel();
		CreateConferenceModel m = new CreateConferenceModel();

		long time = System.currentTimeMillis();
		java.util.Date date  = new java.util.Date(time);
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		
		try
		{
			ResultSet rs=null;
			rs=m.getCountofConferences();
			
			while(rs.next()){
				String date1=rs.getString("abstract_date");
				try
				{
					adate = s.parse(date1);
					 
					if(adate.compareTo(date)>0){
						ArrayList<String> conference = new ArrayList<String>();
						conference.add(rs.getString("conferencename"));
						conference.add(rs.getString("place"));
						chairusername=rs.getString("chairusername");
						c.setUsername(chairusername);
						conference.add(u.getUserEmail(c));
						conference.add(rs.getString("description"));
						
						String date2=rs.getString("paper_date");
						String date3 = rs.getString("conference_date");
					
						pdate = s.parse(date2);
						cdate = s.parse(date3);

						conference.add(new SimpleDateFormat("MM-dd-yyyy").format(adate));
						conference.add(new SimpleDateFormat("MM-dd-yyyy").format(pdate));
						conference.add(new SimpleDateFormat("MM-dd-yyyy").format(cdate));
						
						listofconferences.add(conference);
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}
		
		a.setConferenceDetailsList(listofconferences);
		return a;
	}
}