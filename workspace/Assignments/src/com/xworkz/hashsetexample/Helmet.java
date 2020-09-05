package com.xworkz.hashsetexample;

public class Helmet {
	private String brand;
	private int price;

	public Helmet(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Helmet [brand=" + brand + ", price=" + price + "]";
	}

}
