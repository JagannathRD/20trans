package com.xworkz.compretwoattributes;

public class Student implements Comparable<Student> {
	private int age;
	private String name;
	private String address;

	public Student(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student o) {

		 int comp=(this.age-o.age);
		
		 if(comp==0){
		 comp=name.compareTo(o.name);
		 }
		 return comp;
		 }

//		if (this.age - o.age == 0) {
//			return this.name.compareTo(o.name);
//		}else if (this.age - o.age == -1) {
//			return this.name.compareTo(o.name);
//		} else {
//			return this.name.compareTo(o.name);
//		}

	//}
	// return this.age-o.age;

}
