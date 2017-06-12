package it.uniroma3.spring.model;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name="user_roles")
public class User_roles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_role_id;

	@Max(20)
	@Min(4)
	@NotNull
	@Pattern(regexp = "^[A-Za-z0-9]*$")
	private String username;

	@NotNull
	private String role;

	public User_roles(Long user_role_id, String username, String role) {
		this.user_role_id = user_role_id;
		this.username = username;
		this.role = role;
	}

	public Long getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(Long user_role_id) {
		this.user_role_id = user_role_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}





}
