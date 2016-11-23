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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class TicketAssignment {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	//Error when using onetoone relation
    private String staff_id;

    private int ticket_id;
    
    private String priority;
  
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
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

//	public Staff getStaff_id() {
//		return staff_id;
//	}
//
//	public void setStaff_id(Staff staff_id) {
//		this.staff_id = staff_id;
//	}
//
//	public Ticket getTicket_id() {
//		return ticket_id;
//	}
//
//	public void setTicket_id(Ticket ticket_id) {
//		this.ticket_id = ticket_id;
//	}

//	public Priority getPriority() {
//		return priority;
//	}
//
//	public void setPriority(Priority priority) {
//		this.priority = priority;
//	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
