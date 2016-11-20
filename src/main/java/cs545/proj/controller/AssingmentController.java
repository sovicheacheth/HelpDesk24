package cs545.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Priority;
import cs545.proj.service.TicketService;

@Controller
public class AssingmentController {

//	@Autowired


	@RequestMapping(value = "/ticketAssignment={id}", method = RequestMethod.GET)
	public String assignTicket(@PathVariable("id") int id, Model model) {
		model.addAttribute("enum", Priority.values());

		return "ticketAssignment";
	}

}
