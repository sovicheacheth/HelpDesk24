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

import cs545.proj.domain.HelpTopic;
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
		model.addAttribute("topiclist", topicService.getTopickList());		
		return "topiclist";
	}
}
