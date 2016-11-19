package cs545.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cs545.proj.domain.Staff;
import cs545.proj.repository.StaffRepository;
import cs545.proj.service.StaffService;



public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository staffRepo;
	@Override
	public void StaffRegister(Staff staff) {
		staffRepo.save(staff);
		
	}

	@Override
	public List<Staff> getStaffList() {
		return staffRepo.findAll();
	}

	@Override
	public Staff getStaffById(int id) {
		return staffRepo.findOne(id);
	}

	@Override
	//implement the @query in the service class 
	public Staff getStaffByFirstName(String name) {
		return null;
	}

}
