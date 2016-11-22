package cs545.proj.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cs545.proj.domain.HelpTopic;
import cs545.proj.domain.Ticket;
import cs545.proj.service.HelpTopickService;

@Controller
public class HelpTopickController {

	
	@Autowired
	private HelpTopickService topicService;
	
	@RequestMapping(value="/topic", method=RequestMethod.GET)
	public String createTopic(Model model) {
		HelpTopic topic = new HelpTopic();
		model.addAttribute("topic", topic);
		
		return "topic";
	}
	
	@RequestMapping(value="/topic", method=RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("ticket") HelpTopic topic, BindingResult result, Model model) {		
		if(result.hasErrors()) {
			return "topic";
		} else {
			topicService.saveTopic(topic);
			//model.addAttribute("message", "Saved topic");
			return "redirect:topiclist";
		}
	}
	
	
	@RequestMapping(value="/topiclist", method=RequestMethod.GET)
	public String getAlltickets(Model model) {		
		String goodMessage = "";
		String badMessage = "";
		List<HelpTopic> topics = null;

		try {
			topics = topicService.getTopickList();
			if (topics.size() == 0) {
				goodMessage = "There is no category yet!";
			}

		} catch (Exception e) {
			badMessage = "A problem has ocurred!";
		}

		model.addAttribute("goodMessage", goodMessage);
		model.addAttribute("badMessage", badMessage);
		model.addAttribute("topics", topics);
		return "topiclist";
	}
	
	@RequestMapping(value = "/editTopic", method = RequestMethod.GET)
	public String editTicket(@RequestParam(value = "id") int id, Model model) {
		HelpTopic topic = new HelpTopic();
		topic = (HelpTopic) topicService.getTopic(id);
		if (topic != null) {
			System.out.println("Ticket Found , to be edited  " + topic);
			model.addAttribute("ticket", topic);
			return "editTicket";

		} else {
			model.addAttribute("message", "the catagory not yet ready  ");
			return "topicList";
		}
	}

	@RequestMapping(value = "/editTopic", method = RequestMethod.POST)
	public String editTicket(@RequestParam(value = "id") int id, @ModelAttribute("topic") HelpTopic topic,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "editTicket";
		} else {

			HelpTopic ticketfromdb = new HelpTopic();
			ticketfromdb = (HelpTopic) topicService.getTopic(id);

			ticketfromdb.setTitle(topic.getTitle());		
			topicService.saveTopic(topic);
			return "redirect:/topicList";
		}

	}
	
	@RequestMapping(value = "/deleteTopic", method = RequestMethod.GET)
	public String deleteTicket(@RequestParam(value = "id") int id, Model model) {
		HelpTopic topic = new HelpTopic();
		topic = (HelpTopic) topicService.getTopic(id);
		if (topic != null) {
			System.out.println("Ticket Found , to be edited  " + topic);
			model.addAttribute("ticket", topic);
			return "deleteTicket";

		} else {
			model.addAttribute("message", "the ticket is not yet Completed ");
			return "topicList";
		}
	}

	@RequestMapping(value = "/deleteTopic", method = RequestMethod.POST)
	public String deleteTicket(@RequestParam(value = "id") int id, @ModelAttribute("ticket") HelpTopic topic,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "deleteTicket";
		} else {

			topicService.deleteTopic(topicService.getTopic(id));
			return "redirect:/topicList";
		}
	}
	
	
}
