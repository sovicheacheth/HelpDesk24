package cs545.proj.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Account;
import cs545.proj.domain.Ticket;
import cs545.proj.service.AccountService;

@Controller
public class LoginController {

	
	@Autowired
	
	AccountService accountService;
	
	
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		Account account=new Account();
		model.addAttribute(account);
		
 		return "login";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String createTicket(@Valid @ModelAttribute("account") Account account, BindingResult result, Model model) {		
		
		System.out.println(result.getFieldErrors());
		if(result.hasErrors()){
		return "login";
		}
		else
		{
		
		
		System.out.println(account);
		
		Account acc= accountService.getAccount(account.getUsername());
		
		if(acc==null)
			return "login";
		
		if(acc.getPassword().equals(account.getPassword()))
		
			return "index";
		
		else
			return "login";
		}
	}
	

	
	
	
	
	@RequestMapping(value="/logoutSuccess", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "redirect:/index";
 	}
}
