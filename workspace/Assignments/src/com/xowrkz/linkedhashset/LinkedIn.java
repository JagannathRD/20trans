package com.xowrkz.linkedhashset;

public class LinkedIn {
private String userName;
private int age;
public LinkedIn(String userName, int age) {
	super();
	this.userName = userName;
	this.age = age;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "LinkedIn [userName=" + userName + ", age=" + age + "]";
}


}
