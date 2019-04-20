package com.missionspring.mvcdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.missionspring.mvcdemo.validations.CourseCode;

public class Customer {

	private String firstName;


	@NotNull(message="Should not be empty")
	@Size(min = 1, message = "is required")
	private String lastName;

	
	@NotNull(message="is required")
	@Min(value=0, message="value should not be less than 0")
	@Max(value=10, message="value should not be greater than 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[0-9a-zA-Z]{5}", message = "Postal code should contain only alhpabets or numbers of length 5")
	private String postalCode;
	
	
	@CourseCode
	private String courseCode;
	
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

	public Integer getFreePasses() {
		System.out.println("GET Free Passes " + freePasses);
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		System.out.println("SET Free Passes " + freePasses);
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		System.out.println("getCourseCode");
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
