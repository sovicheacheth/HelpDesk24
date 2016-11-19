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
public class Ticket {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @NotBlank
    @NotNull
	@ManyToOne(cascade=CascadeType.ALL)  
    private HelpTopic helpTitle;
    
    @NotBlank
    private String subject;
    @NotBlank
    private String comment;
    private String file;
    
    @Temporal(TemporalType.DATE)
	private Date date;
    @Enumerated
    private Priority priority;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HelpTopic getHelpTitle() {
		return helpTitle;
	}
	public void setHelpTitle(HelpTopic helpTitle) {
		this.helpTitle = helpTitle;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
    
}
