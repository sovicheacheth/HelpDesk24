package cs545.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs545.proj.domain.Account;
import cs545.proj.domain.Staff;
import cs545.proj.service.StaffService;

@Controller
public class StaffController {

	@Autowired
	StaffService staffService;

	
	@RequestMapping(value="/SignUp", method=RequestMethod.GET)
	public String signingUp(Model model) {
		
		Staff newStaff = new Staff();
		model.addAttribute("staff", newStaff);
		return "SignUp";
	}
	
}
