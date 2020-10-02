package com.xowrkz.treesetex;

import java.util.Comparator;

public class Tree implements Comparable<Tree> {
private String name;
private int age;
private String origin;
public Tree(String name, int age, String origin) {
	super();
	this.name = name;
	this.age = age;
	this.origin = origin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
@Override
public String toString() {
	return "Tree [name=" + name + ", age=" + age + ", origin=" + origin + "]";
}

@Override
public int compareTo(Tree o) {
	
	return this.age-o.age;
}
}
