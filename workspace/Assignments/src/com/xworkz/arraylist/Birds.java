package com.xworkz.arraylist;



public class Birds {

	private String name;
	private String color;
	private double age;
	
	public Birds(String name, String color, double age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Birds [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	

}
