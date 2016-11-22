package cs545.proj.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class TicketAssignment {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
    @NotBlank
    private Staff staff_id;

    @NotBlank
    @OneToOne(cascade=CascadeType.ALL)
    private Ticket ticket_id;
    
    @NotBlank
    @Enumerated
    private Priority priority;
  
    
    @Temporal(TemporalType.DATE)
	private Date date;
    
	@Override
	
	public String toString() {
		return "Assign Ticket [id=" + id + ", staff_id =" + staff_id + ", ticket_id=" + ticket_id + ", priority=" + priority
				+ ", date=" + date + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Staff getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Staff staff_id) {
		this.staff_id = staff_id;
	}

	public Ticket getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(Ticket ticket_id) {
		this.ticket_id = ticket_id;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
