package com.model;

import java.util.Objects;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String role;
	
	public User(int id, String name, String password2, String role2) {
		// TODO Auto-generated constructor stub
	}



	public void User(int userId, String userName, String password, String role) {
		
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, role, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && Objects.equals(role, other.role) && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}
	
	
	
	

}
