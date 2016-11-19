package cs545.proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs545.proj.domain.TicketAssignment;


@Service
public interface TicketAssignmentService {

	public void AssignTicket(TicketAssignment assignment);
	public List<TicketAssignment> getAssignedTickets();
	public TicketAssignment getAssignedTicket(int id);
	public TicketAssignment getAssignedTicketByStaff(String name);
}
