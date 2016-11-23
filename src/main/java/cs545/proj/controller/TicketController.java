package cs545.proj.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cs545.proj.domain.HelpTopic;
import cs545.proj.domain.Status;
import cs545.proj.domain.Ticket;
import cs545.proj.service.HelpTopickService;
import cs545.proj.service.TicketProgressService;
import cs545.proj.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;
	@Autowired
	private TicketProgressService progessService;

	@Autowired
	private HelpTopickService topicService;

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	@RequestMapping(value = "/newTicket", method = RequestMethod.GET)
	public String createTicket(Model model) {
		
		Ticket ticket = new Ticket();
		Map<Integer, String> categoryMap = new LinkedHashMap<Integer, String>();
		for (HelpTopic category : topicService.getTopickList()) {
			categoryMap.put(category.getId(), category.getTitle());
		}
		
		model.addAttribute("categoryMap", categoryMap);
		List<HelpTopic> topicList = null;
		try {
			topicList = topicService.getTopickList();
			if (topicList.size() == 0) {

			}

		} catch (Exception e) {

		}
		
		model.addAttribute("ticket", ticket);
		return "newTicket";
	}

	@RequestMapping(value = "/newTicket", method = RequestMethod.POST)
	public String createTicket(@Valid @ModelAttribute("ticket") Ticket ticket, BindingResult result, Model model) {

	   
		System.out.println(result.getFieldErrors());
		if (result.hasErrors()) {
			return "newTicket";
		} else {
			Date nowTime = new Date();
			ticket.setDate(nowTime);
			System.out.println(ticket);

			ticketService.TicketRegister(ticket);
			return "redirect:/myticketlist";
		}
	}  
	
	
	
	
	
//	@RequestMapping(value = "/newTicket", method = RequestMethod.POST)
//	public String createTicket(@Valid @ModelAttribute("ticket") Ticket ticket, BindingResult result, Model model,@RequestParam CommonsMultipartFile[] fileUpload) {
//
//		
//		System.out.println(result.getFieldErrors());
//		if (result.hasErrors()) {
//			return "newTicket";
//		}else{
//			
//			Date nowTime = new Date();
//			ticket.setDate(nowTime);			
//			System.out.println(ticket);
//			ticketService.TicketRegister(ticket);			
//		       return "redirect:/ticketList";
//		}
//	}
//
//	
	
	
	@RequestMapping(value = "/ticketList", method = RequestMethod.GET)
	public String getAlltickets(Model model) {

		String goodMessage = "";
		String badMessage = "";
		List<Ticket> tickets = null;

		try {
			tickets = ticketService.getTicketList();
			if (tickets.size() == 0) {
				goodMessage = "There is no ticket!";
			}

		} catch (Exception e) {
			badMessage = "A problem has ocurred!";
		}

		model.addAttribute("goodMessage", goodMessage);
		model.addAttribute("badMessage", badMessage);
		model.addAttribute("tickets", tickets);
		return "ticketList";

	}
	@RequestMapping(value = "/myticketlist", method = RequestMethod.GET)
	public String getallMyticket(Model model) {

		String goodMessage = "";
		String badMessage = "";
		List<Ticket> tickets = null;

		try {
			tickets = ticketService.getTicketList();
			if (tickets.size() == 0) {
				goodMessage = "There is no ticket!";
			}

		} catch (Exception e) {
			badMessage = "A problem has ocurred!";
		}

		model.addAttribute("goodMessage", goodMessage);
		model.addAttribute("badMessage", badMessage);
		model.addAttribute("tickets", tickets);
		return "myticketList";

	}
	
	
	
	@RequestMapping(value = "/closeTicket/{id}", method = RequestMethod.GET)
	public String closeTicket(@PathVariable("id") int id, Model model) {
		if (progessService.getTicketStatus(id).contains(Status.COMPLETED)) {
			model.addAttribute("ticket", ticketService.getTicketById(id));
			return "closeTicket";
		} else {
			model.addAttribute("message", "the ticket is not yet Completed ");
			return "ticketList";
		}
	}

	@RequestMapping(value = "/editTicket", method = RequestMethod.GET)
	public String editTicket(@RequestParam(value = "id") int id, Model model) {
		Ticket ticket = new Ticket();
		ticket = (Ticket) ticketService.getTicketById(id);
		if (ticket != null) {
			System.out.println("Ticket Found , to be edited  " + ticket);
			model.addAttribute("ticket", ticket);
			return "editTicket";

		} else {
			model.addAttribute("message", "the ticket is not yet Completed ");
			return "ticketList";
		}
	}

	@RequestMapping(value = "/editTicket", method = RequestMethod.POST)
	public String editTicket(@RequestParam(value = "id") int id, @ModelAttribute("ticket") Ticket ticket,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "editTicket";
		} else {

			Ticket ticketfromdb = new Ticket();
			ticketfromdb = (Ticket) ticketService.getTicketById(id);

			ticketfromdb.setComment(ticket.getComment());
			ticketfromdb.setSubject(ticket.getSubject());
			ticketfromdb.setTopic(ticket.getTopic());
			ticketService.TicketRegister(ticketfromdb);
			return "redirect:/ticketList";
		}

	}

	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/deleteTicket", method = RequestMethod.GET)
	public String deleteTicket(@RequestParam(value = "id") int id, Model model) {
		Ticket ticket = new Ticket();
		ticket = (Ticket) ticketService.getTicketById(id);
		if (ticket != null) {
			System.out.println("Ticket Found , to be edited  " + ticket);
			model.addAttribute("ticket", ticket);
			return "deleteTicket";

		} else {
			model.addAttribute("message", "the ticket is not yet Completed ");
			return "ticketList";
		}
	}

	@RequestMapping(value = "/deleteTicket", method = RequestMethod.POST)
	public String deleteTicket(@RequestParam(value = "id") int id, @ModelAttribute("ticket") Ticket ticket,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "deleteTicket";
		} else {

			ticketService.deleteTicket(ticketService.getTicketById(id));
			return "redirect:/ticketList";
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
