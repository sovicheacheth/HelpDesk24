package cs545.proj.controller;

import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestParam;

import cs545.proj.domain.Staff;
import cs545.proj.domain.Ticket;
import cs545.proj.domain.TicketProgress;
import cs545.proj.service.EmailService;
import cs545.proj.service.StaffService;
import cs545.proj.service.TicketProgressService;
import cs545.proj.service.TicketService;

@Controller
public class ProgressController {

	@Autowired
	TicketService ticketService;

	@Autowired
	TicketProgressService progressService;

	@Autowired
	StaffService staffService;

	@Autowired
	EmailService emailService;

	@RequestMapping(value = "/ticketProgress={id}", method = RequestMethod.GET)
	public String getTicket(@PathVariable("id") int id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));

		TicketProgress tp = new TicketProgress();
		model.addAttribute("ticketProgress", tp);
		Staff staffs = staffService.getStaffById(id);
		model.addAttribute("staff_id", staffs);

		model.addAttribute("note", tp.getNote());
		return "ticketProgress";
	}

	@RequestMapping(value = "/ticketProgress", method = RequestMethod.POST)
	public String progressTicket(@RequestParam(value = "id") int id,
			@Valid @ModelAttribute("ticketprogress") TicketProgress ticketprogress, BindingResult result, Model model) {

		System.out.println(result.getFieldError());

		Staff staff = new Staff();
		staff = (Staff) staffService.getStaffById(id);

		if (result.hasErrors()) {
			System.out.println("Error set ticket progress");
			return "ticketList";
		} else {

			model.addAttribute("staff", staff);

			TicketProgress tp = new TicketProgress();

			Date nowTime = new Date();
			tp.setDate(nowTime);

			tp.setId(id);
			tp.setNote(ticketprogress.getNote());
			tp.setStatus(ticketprogress.getStatus());
			tp.setStaff_id(staff.getId());
			tp.setTicket_id(id);

			progressService.saveProgress(tp);

			// System.out.println(ticketprogress.getStatus());

			model.addAttribute("ticketProgress", tp);

//			String email = staffService.getStaffById(ticketprogress.getStaff_id()).getEmail();
//			String username = staffService.getStaffById(ticketprogress.getStaff_id()).getUsername();
//
//			emailService.assignTicketEmail(email, username, ticketprogress.getId());

			return "redirect:ticketList";
		}

	}

	@RequestMapping(value = "/progressList", method = RequestMethod.GET)
	public String getAllProgressTicket(Model model) {

		List<TicketProgress> tp = null;

		tp = progressService.getProgressList();
		model.addAttribute("progress", tp);

		System.out.println(tp);
		return "progressList";

	}

}
