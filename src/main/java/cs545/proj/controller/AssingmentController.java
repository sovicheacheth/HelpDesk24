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

import cs545.proj.domain.HelpTopic;
import cs545.proj.domain.Priority;
import cs545.proj.domain.Staff;
import cs545.proj.domain.Ticket;
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
		for (Staff staffModel : staffList) {
			System.out.println(staffModel.getFirstname() + " " + staffModel.getLastname());
		}
		model.addAttribute("staffs", staffService.getStaffList());

		model.addAttribute("enum", Priority.values());
		return "ticketAssignment";
	}

	@RequestMapping(value = "/ticketAssignment={id}", method = RequestMethod.POST)
	public String assignTicket(@PathVariable("id") int id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));
		model.addAttribute("staffs", staffService.getStaffList());
		model.addAttribute("enum", Priority.values());
		return "ticketAssignment";
	}

	// @RequestMapping(value = "/ticketAssignment={id}", method =
	// RequestMethod.GET)
	// public String assignTicket(@PathVariable("id") int id, Model model) {
	// model.addAttribute("enum", Priority.values());
	//
	// return "ticketAssignment";
	// }

}
