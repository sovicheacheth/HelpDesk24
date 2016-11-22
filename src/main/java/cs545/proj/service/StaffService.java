package cs545.proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs545.proj.domain.Staff;



public interface StaffService {

	public void StaffRegister(Staff staff);
	public List<Staff> getStaffList();
	public Staff getStaffById(int id);
	public Staff getStaffByFirstName(String name);
	public void deleteStaff(Staff staff);
	public List<Staff> getAllByposition(String position);
}
