package cs545.proj.service;

public interface EmailService {

	public void RegistrationEMail(String email, String userName);

	public void assignTicketEmail(String email, String userName, int ticketId);

	public void progressTicketEmail(String email, String userName, int ticketId);

}
