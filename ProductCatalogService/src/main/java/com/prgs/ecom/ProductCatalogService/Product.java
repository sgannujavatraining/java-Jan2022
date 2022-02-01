package com.prgs.ecom.ProductCatalogService;

public class Product {
	private String name;
	private int price;

	public void setName(String nameParam) {
		name = nameParam;
	}

	public void setPrice(int price) {
		if (price <= 0)
			throw new RuntimeException("Invalid price");
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
