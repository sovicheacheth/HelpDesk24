package cs545.proj.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Ticket {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

   
    @NotNull
    private int topic;

    @NotNull
    private String subject;
    
    private String comment;
    private String file;
    
    @Temporal(TemporalType.DATE)
	private Date date;
   
    private String priority;
	public int getId() {
		return id;
	
	
	
	}
	public void setId(int id) {
		this.id = id;
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
	public void setDate(Date nowTime) {
		this.date = nowTime;
	}
	
	 public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
		
	public int getTopic() {
		return topic;
	}
	public void setTopic(int topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", topic_id=" + topic + ", subject=" + subject + ", comment=" + comment
				+ ", file=" + file + ", date=" + date + ", priority=" + priority + "]";
	}
    
}
