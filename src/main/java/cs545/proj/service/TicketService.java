package cs545.proj.service;

import java.util.Date;
import java.util.List;

import cs545.proj.domain.Status;
import cs545.proj.domain.Ticket;



public interface TicketService {

	public void TicketRegister(Ticket ticket);
	public List<Ticket> getTicketList();
	public Ticket getTicketById(int id);
	public Ticket getTicketBySubject(String subject);
	public Ticket getTicketBytopic(int topic);
	public List<Ticket> getTicketBytopic_id(int topic);
	public List<Ticket> getTicketBydate(Date date);
	public List<Ticket> getTicketBypriority(String status);
	
}
