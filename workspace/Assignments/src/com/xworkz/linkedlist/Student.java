package com.xworkz.linkedlist;

public class Student {
private String name;
private String  usn;
private long mobNo;
public Student(String name, String usn, long mobNo) {
	super();
	this.name = name;
	this.usn = usn;
	this.mobNo = mobNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsn() {
	return usn;
}
public void setUsn(String usn) {
	this.usn = usn;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
@Override
public String toString() {
	return "Student [name=" + name + ", usn=" + usn + ", mobNo=" + mobNo + "]";
}


}
