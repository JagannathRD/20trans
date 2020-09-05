package com.xworkz.priorityqueue;

public class Hospital implements Comparable<Hospital> {
	private String name;
	private String city;
	private String specialised;

	public Hospital(String name, String city, String specialised) {
		super();
		this.name = name;
		this.city = city;
		this.specialised = specialised;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSpecialised() {
		return specialised;
	}

	public void setSpecialised(String specialised) {
		this.specialised = specialised;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", city=" + city + ", specialised=" + specialised + "]";
	}

	@Override
	public int compareTo(Hospital o) {
		
		return this.name.compareTo(o.getName());
	}

}
