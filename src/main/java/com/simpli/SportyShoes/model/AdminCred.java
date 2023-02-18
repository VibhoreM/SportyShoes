package com.simpli.SportyShoes.model;

import org.springframework.stereotype.Component;

@Component
public class AdminCred {
	
	private String username = "Admin";
	private String password = "Admin";
	
	public AdminCred() {
		super();
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



	public boolean verify(String uname, String pwd) {
		if(uname.equals(getUsername()) && pwd.equals(getPassword())) {
			return true;
		}
		else {return false;}
	}
	
	
}
