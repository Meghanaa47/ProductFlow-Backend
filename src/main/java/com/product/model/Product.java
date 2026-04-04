package com.product.model;

import jakarta.persistence.*;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private String category;
    public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product() {
    }
	public Product(String name, int price, String category) {
		this.name = name;
		this.price = price;
		this.category=category;
	}
	public int getId() {
	    return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
