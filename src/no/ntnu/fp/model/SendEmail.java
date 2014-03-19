package no.ntnu.fp.model;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {
	 String to;
	 String from;
	 String host;
	 String emailMessage;
	 public SendEmail(String toEmail, String fromEmail, String emailHeadline, String emailMessage){
		 host="smtp.stud.ntnu.no";
		 to=toEmail;
		 from=fromEmail;
		 this.emailMessage=emailMessage;

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", "smtp.stud.ntnu.no");

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject(emailHeadline);

	         // Now set the actual message
	         message.setText(emailMessage);

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	 }
	 public static void main(String [] args) {
		 SendEmail email = new SendEmail("sondre.padoey@live.com", "sondre.padoey@live.com","Møte", "Mailen fungerer");
		 
	 }
}
