package cs545.proj.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import cs545.proj.domain.Staff;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	//@Query("select u.id,u.firstName,u.lastName from staff u where u.position =:'Technician'")
	
	  List<Staff> findAllByposition(String position);
}
