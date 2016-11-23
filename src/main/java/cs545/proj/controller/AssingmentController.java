package cs545.proj.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cs545.proj.domain.HelpTopic;
import cs545.proj.domain.Priority;
import cs545.proj.domain.Staff;
import cs545.proj.domain.Ticket;
import cs545.proj.domain.TicketAssignment;
import cs545.proj.service.StaffService;
import cs545.proj.service.TicketAssignmentService;
import cs545.proj.service.TicketService;

@Controller
public class AssingmentController {

	@Autowired
	TicketService ticketService;
	@Autowired
	TicketAssignmentService assignmentService;

	@Autowired
	StaffService staffService;

	@RequestMapping(value = "/ticketAssignment={id}", method = RequestMethod.GET)
	public String getTicket(@PathVariable("id") int id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));
		Map<Integer, String> staffmap = new LinkedHashMap<Integer, String>();

		for (Staff s : staffService.getAllByposition("Technician")) {
			staffmap.put(s.getId(), s.getFirstname());
		}

		model.addAttribute("staffMap", staffmap);
		TicketAssignment ta = new TicketAssignment();
		model.addAttribute("ticketAssignment", ta);
		System.out.println(staffmap);
		System.out.println(staffmap.keySet());
		model.addAttribute("enum", Priority.values());
		return "ticketAssignment";

	}

	@RequestMapping(value = "/ticketAssignment", method = RequestMethod.POST)
	public String assignTicket(@RequestParam(value = "id") int id,
			@Valid @ModelAttribute("ticketassignment") TicketAssignment ticketassign, BindingResult result,
			Model model) {

		System.out.println(result.getFieldError());

		if (result.hasErrors()) {
			System.out.println("Error ticket assignment");
			return "ticketList";
		} else {

			TicketAssignment ta = new TicketAssignment();

			// Set Date
			Date nowTime = new Date();
			ta.setDate(nowTime);

			ta.setId(ticketassign.getId());
			ta.setPriority(ticketassign.getPriority());
			ta.setTicket_id(id);
			ta.setStaff_id(ticketassign.getStaff_id());

			assignmentService.AssignTicket(ta);

			// model.addAttribute("id", id);

			// System.out.println(nowTime);
			// System.out.println(ticketassign.getPriority());
			// System.out.println(ticketassign.getTicket_id());
			// System.out.println(ticketassign.getStaff_id());

			System.out.println(id);

			model.addAttribute("ticketAssignment", ta);

			return "redirect:ticketList";
		}
	}

}
