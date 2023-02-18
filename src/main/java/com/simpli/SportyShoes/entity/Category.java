package com.simpli.SportyShoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue
	public int Cid;
	
	@Column(name = "categoryname")
	private String CategoryName;
	
	public Category() {
		// default constructor
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		this.Cid = cid;
	}

	public Category(int cid, String categoryName) {
		super();
		this.Cid = cid;
		this.CategoryName = categoryName;
	}

	
	
	
	
}
