package cs545.proj.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Priority;

@Controller
public class AssingmentController {

	@RequestMapping(value = "/ticketAssignment", method = RequestMethod.GET)
	public String asString(Model model) {
	    List <Priority> proirities =  new ArrayList<Priority>(Arrays.asList(Priority.values()));
	    model.addAttribute("Priority", proirities);
		return "ticketAssignment";
	}

}
