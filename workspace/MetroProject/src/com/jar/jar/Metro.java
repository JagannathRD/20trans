package com.jar.jar;

public class Metro {
	public int coach;
	public String name;
	
	public void transportation(){
		System.out.println("travelling from majestic");
	}

	public Metro(int coach, String name) {
		super();
		this.coach = coach;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Metro [coach=" + coach + ", name=" + name + "]";
	}

}
