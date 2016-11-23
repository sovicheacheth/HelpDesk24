package cs545.proj.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Account;
import cs545.proj.domain.Role;
import cs545.proj.domain.Ticket;
import cs545.proj.service.AccountService;

@Controller
public class LoginController {

	
	@Autowired
	
	AccountService accountService;
	
	@RequestMapping(value="/Home", method = RequestMethod.GET)
	public String Home(Model model) {
			
 		return "Home";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
 		return "login";
	}
 
	@RequestMapping(value="/loginFailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("message", "Login Failed Please try again ");
		return "login";
	}
 
	
	
	@RequestMapping(value="/logoutSuccess", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "redirect:/Home";
 	}
}
