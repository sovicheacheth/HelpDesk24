package cs545.proj.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cs545.proj.domain.Status;
import cs545.proj.domain.Ticket;
import cs545.proj.repository.TicketRepository;
import cs545.proj.service.TicketService;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepo;

	@Override
	public void TicketRegister(Ticket ticket) {
		ticketRepo.save(ticket);
	}

	@Override
	public List<Ticket> getTicketList() {

		return ticketRepo.findAll();
	}
	@Override
	public Ticket getTicketById(int id) {

		return ticketRepo.findByid(id);
	}
	@Override
	public Ticket getTicketBySubject(String subject) {
		return ticketRepo.findBysubject(subject);
	}
	@Override
	public Ticket getTicketBytopic(int topic) {

		return null;
	}
	@Override
	public List<Ticket> getTicketBytopic_id(int topic) {
		// TODO Auto-generated method stub
		return ticketRepo.findAllBytopic(topic);
	}
	@Override
	public List<Ticket> getTicketBydate(Date date) {
		return ticketRepo.findAllBydate(date);
	}

	@Override
	public List<Ticket> getTicketBypriority(String status) {
		
		return ticketRepo.findAllBypriority(status);
		
	}

	@Override
	public void deleteTicket(Ticket ticket) {
		ticketRepo.delete(ticket);
		
	}

	

}
