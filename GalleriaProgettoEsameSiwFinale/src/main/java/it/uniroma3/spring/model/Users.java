package it.uniroma3.spring.model;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="users")
public class Users {
	@Max(20)
	@Min(4)
	@NotNull
	@Pattern(regexp = "^[A-Za-z0-9]*$")
	private String username;

	@Max(20)
	@Min(4)
	@NotNull
	@Pattern(regexp = "^[A-Za-z0-9]*$")
	private String password;

	private boolean enabled;

	

	
public Users(String username, String password, boolean enabled) {

		this.username = username;
		this.password = password;
		this.enabled = true;
	}

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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}







}
