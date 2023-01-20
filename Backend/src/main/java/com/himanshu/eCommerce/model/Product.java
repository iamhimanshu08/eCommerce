package com.himanshu.eCommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private long id;
	@NotNull
	private String name;
	@NotNull
	private long price;
	@NotNull
	private String details;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Product() {
		super();
	}

	public Product(Long id, String name, long price, String details) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.details = details;
	}
	
	

}
