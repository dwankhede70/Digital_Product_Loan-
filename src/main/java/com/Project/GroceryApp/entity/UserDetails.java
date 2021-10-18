package com.Project.GroceryApp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class UserDetails {
	@Id
	private Long uid;
	private Long password;
	private String userName;
	private String email;
	private String phoneNo;
	private String address;
	private boolean isLogin;
	
	public UserDetails() {
		
	}

	public UserDetails(Long uid, Long password, String userName, String email, String phoneNo, String address) {
		super();
		this.uid = uid;
		this.password = password;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.isLogin = false;
	}

	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDetails [uid=" + uid + ", password=" + password + ", userName=" + userName + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", address=" + address + ", isLogin=" + isLogin + "]";
	}

	
}
