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
import cs545.proj.domain.TicketAssignment;
import cs545.proj.service.StaffService;
import cs545.proj.service.TicketService;

@Controller
public class AssingmentController {

	@Autowired
	TicketService ticketService;
	@Autowired
	StaffService staffService;
	
	@RequestMapping(value = "/ticketAssignment={id}", method = RequestMethod.GET)
	public String getTicket(@PathVariable("id") int id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		TicketAssignment ta = new TicketAssignment();
		model.addAttribute("ticketassignment", ta);

		model.addAttribute("enum", Priority.values());
		return "ticketAssignment";

	}

	@RequestMapping(value = "/ticketAssignment", method = RequestMethod.POST)
	public String assignTicket(@Valid @ModelAttribute("ticketassignment") TicketAssignment ticketassign, BindingResult result, Model model) {
		System.out.println(result.getFieldErrors());
		if(result.hasErrors()){
			System.out.println("Error insert into Ticket Assignment");
			return "ticketList";
		}else{
			model.addAttribute("ticketassignment", ticketassign);
			return "ticketList";
		}
	}

}
