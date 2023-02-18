package com.simpli.SportyShoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchasereport")
public class PurchaseReport {
	
	@Id
	@Column(name = "user")
	private String user;
	
	@Column(name = "product")
	private String product;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "date")
	private String date;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public PurchaseReport(String user, String product, int qty, String category, String date) {
		super();
		this.user = user;
		this.product = product;
		this.qty = qty;
		this.category = category;
		this.date = date;
	}
	
	public PurchaseReport() {
		
	}
	

}
