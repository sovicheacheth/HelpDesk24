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
import cs545.proj.domain.Staff;
import cs545.proj.service.AccountService;
import cs545.proj.service.StaffService;

@Controller
public class StaffController {

	@Autowired
	StaffService staffService;

	@Autowired
	AccountService accountService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {

		Staff newStaff = new Staff();
		model.addAttribute("staff", newStaff);
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("staff") Staff staff, BindingResult result, Model model) {

		
		System.out.println(result.getFieldError());

		if (result.hasErrors()) {
			return "register";
		}

		else {	
			
			Account account=new Account();
			account.setUsername(staff.getUsername());
			account.setPassword(staff.getPassword());
			account.setRole(Role.STAFF);
			
			accountService.saveAccount(account);

			staffService.StaffRegister(staff);

			return "redirect:login";
		}
	}
	

	//get staff list
	
	
	@RequestMapping(value="/staffList", method=RequestMethod.GET)
	public String getAllstaffs(Model model) {		
		model.addAttribute("staffList", staffService.getStaffList());		
		return "staffList";
	}
	
	

}
