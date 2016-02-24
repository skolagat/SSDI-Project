package test;

//import java.sql.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import controller.AutomaterEmailCtr;
import model.AuthorloginModel;
import model.ListofConferencesModel;

public class SendRemainders {
	
	Logger logger = Logger.getLogger("myLogger");
	
	AuthorloginModel alm = new AuthorloginModel();
	ListofConferencesModel l = new ListofConferencesModel();
	HashMap<String,Date> h = new HashMap<String,Date>();
	
	
	
	public void doSendRemainders(){
	logger.log(Level.INFO, "Inside Cron Function");
		
		String email="";
		long time=System.currentTimeMillis();
		Date d= new Date(time);
		h=l.doGetDates();	
		
		for(String keys:h.keySet()){
			Date value=h.get(keys);
			System.out.println(value);
			System.out.println(d);
			if(value.compareTo(d)>0){
				logger.log(Level.INFO, "Preparing to Send Email to Authors");
				email=alm.getAuthorDetail(keys);
				
				String subject="Easy Research Remainder";
				String message="Pls Submit";
				AutomaterEmailCtr e = new AutomaterEmailCtr();
				try {
					e.sendEmailMessage(email, subject, message);
				} catch (AddressException e1) {
					logger.log(Level.SEVERE, "Mail Sending Problem due to Invalid Email");
					e1.printStackTrace();
				} catch (MessagingException e1) {
					logger.log(Level.SEVERE, "Mail Failed due to Server Issues");
					e1.printStackTrace();
					
				}
				
			}
			else{
				logger.log(Level.INFO, "Dates are good .No emails Sent");
			}
			
			
		}
		
	}
}
