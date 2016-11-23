package cs545.proj.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
@Entity
public class TicketProgress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

//	@NotBlank
	private String note;

//	@NotBlank
//	@Enumerated
//	private Status status;
	
	private String status;

	@Temporal(TemporalType.DATE)
	private Date date;
	
//	@NotNull
//	@ManyToOne(cascade=CascadeType.ALL)  
//	private Staff staff_id;
//	
//	@NotNull
//	@ManyToOne(cascade=CascadeType.ALL)  
//	private Ticket ticket_id;
	
	
	private int staff_id;
	
	private int ticket_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	
}
