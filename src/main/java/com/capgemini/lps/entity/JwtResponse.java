package com.capgemini.lps.entity;

import java.io.Serializable;

public class JwtResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String jwttoken;
	private int userId;
	private String fullName;
	
	public String getJwttoken() {
		return jwttoken;
	}

	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String email;
	private String role;
	
	public JwtResponse(String jwttoken, int userId, String fullName, String email,String role ) {
		this.jwttoken = jwttoken;
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.role = role;
}	
	public JwtResponse() {


	}
}
