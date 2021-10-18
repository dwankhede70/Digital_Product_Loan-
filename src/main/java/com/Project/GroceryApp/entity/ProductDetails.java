package com.Project.GroceryApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductDetails {
	@Id
	private Long pid;
	private String pname;
	private Long price;
	private String purl;
	private String ptype;
	
	public ProductDetails() {
		
	}

	public ProductDetails(Long pid, String pname, Long price, String purl) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.purl = purl;
		this.ptype=ptype;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
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
