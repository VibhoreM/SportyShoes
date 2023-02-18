package com.simpli.SportyShoes.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	
	@Id
	@GeneratedValue
	int Id;
	
	@Column(name = "product")
	String product;
	

	@Column(name = "category")
	String category;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Products(int id, String product, String category) {
		super();
		Id = id;
		this.product = product;
		this.category = category;
	}
	
	
	public Products() {
		super();
		
	}
	
	
	
	
	

}
