package com.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String fname;
	private String lname;
	private String email;
	private long phone;
	public Contact(String fname, String lname, String email, long phone) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}
	
	public Contact(int cid, String fname, String lname, String email, long phone) {
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public Contact() {
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

}
