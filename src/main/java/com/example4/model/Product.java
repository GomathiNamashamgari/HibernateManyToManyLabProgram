package com.example4.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String productname;
	
	@ManyToMany(mappedBy="product" , fetch=FetchType.EAGER)
	private Set<Cart> cart = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}

	public Product(int id, String productname, Set<Cart> cart) {
		super();
		this.id = id;
		this.productname = productname;
		this.cart = cart;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
