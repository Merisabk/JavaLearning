package com.qa.scanner;

public class Person {
	
	private String name;
	private int age;
	private String jobTitle;
	
	 
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	// to access the properties - right-click source/ generate getters and setters. 

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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		String myString = "Name: " + name + "\n" + "Age: " + age + "\n" + "Job Title: " + jobTitle;
		return myString;
	}
	
}
