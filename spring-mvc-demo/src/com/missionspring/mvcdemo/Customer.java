package com.missionspring.mvcdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;


	@NotNull(message="Should not be empty")
	@Size(min = 1, message = "is required")
	private String lastName;

	
	@Min(value=0, message="value should not be less than 0")
	@Max(value=10, message="value should not be greater than 10")
	private int freePasses;
	
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

	public int getFreePasses() {
		System.out.println("GET Free Passes " + freePasses);
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		System.out.println("SET Free Passes " + freePasses);
		this.freePasses = freePasses;
	}
}
