package com.oneoutlet.webportal.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImp implements EmailService {
	
	@Autowired
	private JavaMailSender getJavaMailSender;
	
	public void sendMail(String to,String subject,String text) {
		
		/*
		 * SimpleMailMessage mailMessage=new SimpleMailMessage();
		 * 
		 * mailMessage.setTo(to); mailMessage.setSubject(subject);
		 * mailMessage.setText(text);
		 * 
		 * getJavaMailSender.send(mailMessage);
		 */
		
		MimeMessage message= getJavaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(message,true);
			
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text, true);
			getJavaMailSender.send(message);
			
		} catch (MessagingException e) {
			System.out.println(" error "+e);
			e.printStackTrace();
			
		}
	}

}
