package com.test.spring.model;

public class Product {

	private int productId;
	
	private String productTitle;
	
	private double productPrice;
	
	private int productQuantity;
	
	private String productDesripton;
	
	private Brand brand;
	
	private Categary categary;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductDesripton() {
		return productDesripton;
	}

	public void setProductDesripton(String productDesripton) {
		this.productDesripton = productDesripton;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Categary getCategary() {
		return categary;
	}

	public void setCategary(Categary categary) {
		this.categary = categary;
	}
	
	
}
