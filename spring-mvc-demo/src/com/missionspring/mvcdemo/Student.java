package com.missionspring.mvcdemo;

public class Student {
	
	String firstName;
	
	String lastName;

	public String getFirstName() {
		System.out.println("GET getFirstName");
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("GET lastName");
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
