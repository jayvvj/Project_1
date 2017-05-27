package com.abc.BackEnd1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	private String email;
	@Column
	private String name;
	private String pwd;
	private String phno;
	private String addr;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getCPwd() {
		return pwd;
	}
	public void setCPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getPhno() {
		return phno;
	}
	
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}	
}