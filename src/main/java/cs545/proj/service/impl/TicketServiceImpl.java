package cs545.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cs545.proj.domain.Ticket;
import cs545.proj.repository.TicketRepository;
import cs545.proj.service.TicketService;


public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketRepository ticketRepo;
	
	
	@Override
	public void TicketRegister(Ticket ticket) {
		ticketRepo.save(ticket);
		
	}

	@Override
	public List<Ticket> getTicketList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicketById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicketBySubject(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
