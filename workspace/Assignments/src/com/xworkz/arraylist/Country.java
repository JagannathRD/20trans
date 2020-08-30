package com.xworkz.arraylist;

public class Country implements Comparable<Country>{
	private int noOfStaes;
	private String name;
	private int counryCode;

	public Country(int i, String name, int counryCode) {
		super();
		this.noOfStaes = i;
		this.name = name;
		this.counryCode = counryCode;
	}

	public int getNoOfStaes() {
		return noOfStaes;
	}

	public void setNoOfStaes(int noOfStaes) {
		this.noOfStaes = noOfStaes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCounryCode() {
		return counryCode;
	}

	public void setCounryCode(int counryCode) {
		this.counryCode = counryCode;
	}

	@Override
	public String toString() {
		return "Country [noOfStaes=" + noOfStaes + ", name=" + name + ", counryCode=" + counryCode + "]";
	}

	@Override
	public int compareTo(Country o) {
		
		return o.counryCode-this.counryCode;
	}
	
}
