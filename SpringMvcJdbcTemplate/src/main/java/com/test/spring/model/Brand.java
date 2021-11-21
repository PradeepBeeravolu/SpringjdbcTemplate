package com.test.spring.model;

import java.util.List;

public class Brand {
	
	private int brandId;
	
	private String brandTitle;
	
	private List<Product> listProduct;

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandTitle() {
		return brandTitle;
	}

	public void setBrandTitle(String brandTitle) {
		this.brandTitle = brandTitle;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}
	
	

}
