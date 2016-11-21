package cs545.proj.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Valid
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	@NotBlank
	private String gender;
	
	@Valid
	//@OneToOne(cascade=CascadeType.ALL)
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotNull
	private String firstname;
	@NotNull
	private String lastname;
	@NotNull
	@Email
	private String email;
	@NotNull
	private String position;
	@NotNull
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", address=" + address + ", gender=" + gender + ", username=" + username
				+ ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", position=" + position + ", mobile=" + mobile + "]";
	}
	
	
}
