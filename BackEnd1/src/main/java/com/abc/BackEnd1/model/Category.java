package com.abc.BackEnd1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table
	public class Category 
	{
		@Id
		private String CatId;
		@Column
		private String name;
		//private String products;
		
		public String getCatId() {
			return CatId;
		}
		public void setCatId(String CatId) {
			this.CatId = CatId;
		}		
		///////////////////////////////////////////////////////
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		///////////////////////////////////////////////////////
		/*public String getProducts() {
			return products;
		}
		public void setProducts(String products) {
			this.products = products;
		}*/
	}