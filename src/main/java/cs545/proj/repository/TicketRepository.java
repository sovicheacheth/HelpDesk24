package cs545.proj.repository;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cs545.proj.domain.Status;
import cs545.proj.domain.Ticket;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

	List<Ticket>findAllBydate(Date date);
	List<Ticket>findAllBypriority(String priority);
	List<Ticket>findAllBytopic(int topic_id);
	Ticket findBysubject(String subject);
	Ticket findByid(int id);
	
}
