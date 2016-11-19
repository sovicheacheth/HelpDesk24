package cs545.proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs545.proj.domain.Ticket;


@Service
public interface TicketService {

	public void TicketRegister(Ticket ticket);
	public List<Ticket> getTicketList();
	public Ticket getTicketById(int id);
	public Ticket getTicketBySubject(String subject);
}
