package com.abc.BackEnd1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {
	@Id
	private String SId;
	@Column
	private String name;
	//private String categories;
	
	public String getSId() {
		return SId;
	}
	public void setSId(String SId) {
		this.SId = SId;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	/*public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}*/

}
