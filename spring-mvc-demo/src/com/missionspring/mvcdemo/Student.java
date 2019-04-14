package com.missionspring.mvcdemo;

import java.util.HashMap;
import java.util.Map;


public class Student {
	
	String firstName;
	
	String lastName;
	
	String favouriteLanguage;
	
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	String country;
	
	String[] os;

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	Map<String, String> countryOptions;
	Map<String, String> langOptions;
	
	public Student() {
		countryOptions = new HashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("US", "USA");
		countryOptions.put("ES", "Spain");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("DE", "Germany");
		
		langOptions = new HashMap<String, String>();
		langOptions.put("EN","English");
		langOptions.put("FR","French");
		langOptions.put("DE","German");
		langOptions.put("ES","Spanish");
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}
	public Map<String, String> getLangOptions() {
		return langOptions;
	}

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
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
