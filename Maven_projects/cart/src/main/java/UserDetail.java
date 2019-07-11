//$Id$
package com.shopping.cart;

public class UserDetail {
	private int id;
    private String username;
    private String password;
    private String name;
    private String email;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", email=" + email + "]";
	}
}
