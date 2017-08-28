package com.ZippSlipAutomation.utilities;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

@SuppressWarnings("unused")
public class SendMail {

	public void emailSendFunction() throws Exception {

		// String to = "sameer.arora@puresoftware.com";
		String from = "sameer.arora@quovantis.com";

		// Assuming you are sending email through Mail
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "587");
		// props.put("mail.smtp.socketFactory.class",
		// "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		

				
		// Get the Session object.
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			
			String password = EncryptNDecrypt.decrypt("S0/n04uI+wXAfled88SRBg==");
			
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("sameer.arora@quovantis.com", password);
			}
		});
		try {
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipients(Message.RecipientType.TO, InternetAddress.parse("sameer.arora@quovantis.com"));
			 message.addRecipients(Message.RecipientType.CC,	InternetAddress.parse("yashika.dawar@quovantis.com"));

			// Set Subject: header field
			message.setSubject("Test Mail");

			// Create the message part
			BodyPart messageBodyPart = new MimeBodyPart();

			// Now set the actual message
			messageBodyPart.setText("The excel attached contains the results for the test cases. PFA");

			// Create a multipar message
			Multipart multipart = new MimeMultipart();

			// Set text message part
			multipart.addBodyPart(messageBodyPart);
/*
			// Part two is attachment
			messageBodyPart = new MimeBodyPart();
			String filename = "C://Users//sameer.arora//Desktop//Sameer//TestDataSheet.xls";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);*/

			// Send the complete message parts
			message.setContent(multipart);

			// Send message
			Transport.send(message);

			System.out.println("Email sent successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
	
/*
	public static void main(String[] args) throws Exception {
		SendMail sendMail = new SendMail();
		sendMail.emailSendFunction();
	}*/
}
