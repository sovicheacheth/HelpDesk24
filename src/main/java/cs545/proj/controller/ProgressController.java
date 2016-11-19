package cs545.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Ticket;

@Controller
public class ProgressController {

	@RequestMapping(value="/ticketProgress", method=RequestMethod.GET)
	public String createTicket(Model model) {
		Ticket newticket = new Ticket();
		model.addAttribute("ticket", newticket);		
		return "ticketProgress";
	}
}
