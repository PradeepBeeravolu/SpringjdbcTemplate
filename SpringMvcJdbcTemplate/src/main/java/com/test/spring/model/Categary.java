package com.test.spring.model;

import java.util.List;

public class Categary {
	
	private int categaryId;
	
	private String categaryTitle;
	
	private List<Product> listProducts;

	public int getCategaryId() {
		return categaryId;
	}

	public void setCategaryId(int categaryId) {
		this.categaryId = categaryId;
	}

	public String getCategaryTitle() {
		return categaryTitle;
	}

	public void setCategaryTitle(String categaryTitle) {
		this.categaryTitle = categaryTitle;
	}

	public List<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
	
	

}
