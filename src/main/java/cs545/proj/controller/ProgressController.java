package cs545.proj.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Priority;
import cs545.proj.domain.Staff;
import cs545.proj.domain.Ticket;
import cs545.proj.domain.TicketAssignment;
import cs545.proj.domain.TicketProgress;
import cs545.proj.service.StaffService;
import cs545.proj.service.TicketService;

@Controller
public class ProgressController {
	
	@Autowired
	TicketService ticketService;
	
	@Autowired
	StaffService staffService;

	@RequestMapping(value = "/ticketProgress={id}", method = RequestMethod.GET)
	public String getTicket(@PathVariable("id") int id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		TicketProgress ta = new TicketProgress();
		model.addAttribute("ticketassignment", ta);

		model.addAttribute("enum", Priority.values());
		return "ticketProgress";

	}

	@RequestMapping(value = "/ticketProgress", method = RequestMethod.POST)
	public String assignTicket(@Valid @ModelAttribute("ticketprogress") TicketProgress ticketprogress, BindingResult result, Model model) {
		System.out.println(result.getFieldErrors());
		if(result.hasErrors()){
			System.out.println("Error insert into Ticket Progress");
			return "ticketList";
		}else{
			
			model.addAttribute("ticketassignment", ticketprogress);
			return "ticketList";
		}
	}
}
