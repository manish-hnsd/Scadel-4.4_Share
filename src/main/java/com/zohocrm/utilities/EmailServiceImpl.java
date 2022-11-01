package com.zohocrm.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender sendMail;
	
//	@Autowired
//	private SimpleMailMessage mail;
	
	@Override
	public void sendEmail(String to, String sub, String email) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(sub);
		mail.setText(email);
		
		sendMail.send(mail);
	}

}
