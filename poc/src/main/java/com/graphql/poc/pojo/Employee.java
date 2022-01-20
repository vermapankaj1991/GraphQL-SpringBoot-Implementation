package com.graphql.poc.pojo;

public class Employee {

	private int id;
	private String name;
	private int age;
	private int addressId;
	
	public Employee(int id, String name, int age, int addressId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addressId = addressId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
}
