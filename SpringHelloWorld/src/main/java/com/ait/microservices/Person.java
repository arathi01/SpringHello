package com.ait.microservices;

public class Person {
	private String firstName;
	private String lastName;
	private Integer age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName,String lastName,int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setAge(age);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge(int age) {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
