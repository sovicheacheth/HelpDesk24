package cs545.proj.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class Account {

	@Id
	@Column(nullable = false, unique = true)
	private String username;
	@NotNull
	private String password;
	@Enumerated(EnumType.STRING)
	
	
//	  @Enumerated(EnumType.STRING)
	private Role role;
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
