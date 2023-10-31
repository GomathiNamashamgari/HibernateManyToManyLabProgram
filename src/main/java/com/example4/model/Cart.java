package com.example4.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cart
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="cart_product",joinColumns=@JoinColumn(name="cart_id"),
	inverseJoinColumns=@JoinColumn(name="product_id"))
	private Set<Product> product= new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Cart(int id, Set<Product> product) {
		super();
		this.id = id;
		this.product = product;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
