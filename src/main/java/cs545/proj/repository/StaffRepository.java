package cs545.proj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cs545.proj.domain.Staff;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	
}
