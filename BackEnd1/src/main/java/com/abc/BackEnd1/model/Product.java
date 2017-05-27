package com.abc.BackEnd1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	private String PId;
	@Column
	private String name;
	private String desc;
	private String price;
	private int quantity;
	
	
	public String getPId() {
		return PId;
	}
	public void setPId(String PId) {
		this.PId = PId;
	}
	
	
	public String getName(){
		return name;
	}
	public void setName(String name)
	{
		this.name = name;	
	}
	
	
	public String getDesc(){
		return desc;
	}
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price = price;
	}
	
	
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
}