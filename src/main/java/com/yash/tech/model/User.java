 /**
  * rajpal.dodiya
  */
package com.yash.tech.model;
import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    long userId;
    String firstName;
    String lastName;
    String feedback;
    long phone;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", feedback="
				+ feedback + ", phone=" + phone + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String firstName, String lastName, String feedback, int phone) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.feedback = feedback;
		this.phone = phone;
	}
    
 
   
}