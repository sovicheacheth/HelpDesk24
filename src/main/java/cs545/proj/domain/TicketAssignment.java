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

}
