package cs545.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class welcomeController {

	@RequestMapping("/")
	public String listMembers(Model model) {
		model.addAttribute("categories", "mahilet");
		return "index";
	}
}
