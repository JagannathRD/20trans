package com.xworkz.arraylist;

public class Mountains {
	private double height;
	private String name;
	private String location;

	public Mountains(double height, String name, String location) {
		super();
		this.height = height;
		this.name = name;
		this.location = location;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Mountains [height=" + height + ", name=" + name + ", location=" + location + "]";
	}

}
