package com.Project.GroceryApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long oid;
	private Long uid;
	private Long pid;
	private String purl;
	private String pname;
	private Long price;
	private Long cid;
	
	public OrderDetails() {
		
	}

	public OrderDetails(Long oid, Long uid, Long pid, String purl, String pname, Long price, Long cid) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.pid = pid;
		this.purl = purl;
		this.pname = pname;
		this.price = price;
		this.cid = cid;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPurl() {
		return purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
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

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	
	
}
