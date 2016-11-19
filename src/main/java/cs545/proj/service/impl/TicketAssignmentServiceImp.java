package cs545.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cs545.proj.domain.TicketAssignment;
import cs545.proj.repository.TicketAssignmentRepository;
import cs545.proj.service.TicketAssignmentService;



public class TicketAssignmentServiceImp implements TicketAssignmentService {

	@Autowired
	TicketAssignmentRepository assignmentRepo;
	@Override
	public void AssignTicket(TicketAssignment assignment) {
		assignmentRepo.save(assignment);
		
	}

	@Override
	public List<TicketAssignment> getAssignedTickets() {
		return assignmentRepo.findAll();
	}

	@Override
	public TicketAssignment getAssignedTicket(int id) {
		
		return assignmentRepo.getOne((long)id);
	}

	// we should have to implement our own query for jpql 
	@Override
	public TicketAssignment getAssignedTicketByStaff(String name) {
		return null;
	}

}
