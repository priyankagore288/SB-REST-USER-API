package com.example.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="USER_DTIL")
public class User {
	
	@Id
	private Integer userId;
	private String userName;
	private String userAddress;
	private String userContact;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userContact="
				+ userContact + "]";
	}
	
	
	

}
