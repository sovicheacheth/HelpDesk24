package cs545.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs545.proj.domain.Staff;
import cs545.proj.repository.StaffRepository;
import cs545.proj.service.StaffService;


@Service
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
	
	
	public Staff getStaffByFirstName(String name) {
		return null;
	}

	@Override
	public void deleteStaff(Staff staff) {
		staffRepo.delete(staff);
		
	}

	@Override
	public List<Staff> getAllByposition(String position) {
		
		return staffRepo.findAllByposition(position);
	}

	

}
