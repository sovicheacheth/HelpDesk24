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

import cs545.proj.domain.Account;
import cs545.proj.domain.Role;
import cs545.proj.domain.Staff;
import cs545.proj.service.AccountService;
import cs545.proj.service.StaffService;
import cs545.proj.service.impl.EmailServiceImpl;

@Controller
public class StaffController {

	@Autowired
	StaffService staffService;

	@Autowired
	AccountService accountService;

	@Autowired
	EmailServiceImpl emailService;
	
	//Registration
	
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
			account.setRole(Role.ROLE_STAFF);
			
			accountService.saveAccount(account);

			staffService.StaffRegister(staff);
			
			emailService.RegistrationEMail(staff.getEmail(), staff.getFirstname());

			return "redirect:login";
		}
	}
	

	//get staff list
	
	
	@RequestMapping(value="/staffList", method=RequestMethod.GET)
	public String getAllstaffs(Model model) {	
		
		
	
	    List<Staff> staffs = null;

		staffs = staffService.getStaffList();
		model.addAttribute("staffs", staffs);
		
		System.out.println(staffs);
		return "staffList";	
		
	}
	
	
	//Edit staff
	

	@RequestMapping(value = "/editStaff", method = RequestMethod.GET)
	public String editTicket(@RequestParam(value = "id") int id, Model model) {
		Staff staff = new Staff();
		staff = (Staff) staffService.getStaffById(id);
		if (staff != null) {
		
			
			model.addAttribute("staff", staff);
			return "editStaff";

		} else {
			model.addAttribute("message", "no such staff");
			return "staffList";
		}
	}

	@RequestMapping(value = "/editStaff", method = RequestMethod.POST)
	public String editTicket(@RequestParam(value = "id") int id, @ModelAttribute("staff") Staff staff,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "editStaff";
		} else {

			Staff stafffromdb = new Staff();
			stafffromdb = (Staff) staffService.getStaffById(id);
		
			stafffromdb.setFirstname(staff.getFirstname());
			stafffromdb.setLastname(staff.getLastname());
			stafffromdb.setEmail(staff.getEmail());
			stafffromdb.setMobile(staff.getMobile());
			//stafffromdb.getAddress().setBuildingNo(staff.getAddress().getBuildingNo());
			//stafffromdb.getAddress().setOfficeNo(staff.getAddress().getOfficeNo());
			stafffromdb.setUsername(staff.getUsername());
			
			
			System.out.println(staff.toString());
			staffService.StaffRegister(stafffromdb);
			
		
			return "redirect:/staffList";
		}

	}
	
	
	//Delete
	
	
	@RequestMapping(value = "/deleteStaff", method = RequestMethod.GET)
	public String deleteTicket(@RequestParam(value = "id") int id, Model model) {
		Staff staff = new Staff();
		staff = (Staff) staffService.getStaffById(id);
		if (staff != null) {
			//System.out.println("staff Found , to be edited  " + staff);
			model.addAttribute("staff", staff);
			return "deleteStaff";

		} else {
			model.addAttribute("message", "staff ");
			return "staffList";
		}
	}
	
	
	@RequestMapping(value = "/deleteStaff", method = RequestMethod.POST)
	public String deleteTicket(@RequestParam(value = "id") int id, @ModelAttribute("staff") Staff staff,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "deleteStaff";
		} else {

			staffService.deleteStaff(staffService.getStaffById(id));
			return "redirect:/staffList";
		}

	}
	

}

	
	
	

