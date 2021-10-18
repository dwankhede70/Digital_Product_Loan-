package com.Project.GroceryApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	private Long pid;
	private String pname;
	private Long price;
	private String purl;
	private Long uid;
	
	public CartDetails() {
		
	}

	public CartDetails(Long pid, String pname, Long price, String purl) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.purl = purl;
	}
	

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPurl() {
		return purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
	}

}
