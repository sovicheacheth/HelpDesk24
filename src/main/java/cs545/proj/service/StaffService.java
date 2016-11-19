package cs545.proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs545.proj.domain.Staff;


@Service
public interface StaffService {

	public void StaffRegister(Staff staff);
	public List<Staff> getStaffList();
	public Staff getStaffById(int id);
	public Staff getStaffByFirstName(String name);
}
