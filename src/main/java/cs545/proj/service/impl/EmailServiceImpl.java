package cs545.proj.service.impl;



import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import cs545.proj.repository.StaffRepository;
import cs545.proj.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	StaffRepository staffRepo;
	@Autowired
	private JavaMailSender mailSender;
	

	public void RegistrationEMail(String email,String userName) {
		try {

			String fromAddress = String.format("IT HelpDesk <ITHelpDesk.com>");

			String subject = "Registration confirmation";

			String msgBody = String.format("<html><body>Dear "+ userName + " , </br>you have been registered! </br> !</body></html>");

			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
			
			mimeMessage.setContent(msgBody, "text/html");
			helper.setTo(email);
			helper.setSubject(subject);
			helper.setFrom(fromAddress);
			mailSender.send(mimeMessage);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	
}
