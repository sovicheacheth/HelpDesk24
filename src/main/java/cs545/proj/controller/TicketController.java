package cs545.proj.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Status;
import cs545.proj.domain.Ticket;
import cs545.proj.service.TicketProgressService;
import cs545.proj.service.TicketService;


@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;
	@Autowired
	private TicketProgressService progessService;
	
	@RequestMapping(value="/newTicket", method=RequestMethod.GET)
	public String createTicket(Model model) {
		Ticket newticket = new Ticket();
		model.addAttribute("ticket", newticket);		
		return "newTicket";
	}
	
	@RequestMapping(value="/newTicket", method=RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("ticket") Ticket ticket, BindingResult result, Model model) {		
		if(result.hasErrors()) {
			return "newTicket";
		} else {
			ticketService.TicketRegister(ticket);
			model.addAttribute("message", "Saved ticket details");
			return "redirect:ticketlist";
		}
	}
	
	@RequestMapping(value="/ticketList", method=RequestMethod.GET)
	public String getAlltickets(Model model) {		
		model.addAttribute("ticketList", ticketService.getTicketList());		
		return "ticketlist";
	}
	
	@RequestMapping(value="/closeTicket/{id}", method=RequestMethod.GET)
	public String closeTicket(@PathVariable("id") int id, Model model) {
		if(progessService.getTicketStatus(id).contains(Status.COMPLETED)){
		model.addAttribute("ticket", ticketService.getTicketById(id));
		return "closeTicket";
		}else{
			model.addAttribute("message", "the ticket is not yet Completed ");
			return "ticketList";
		}
	}
	
}
