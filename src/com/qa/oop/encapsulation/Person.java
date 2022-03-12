package com.qa.oop.encapsulation;

public class Person {
	

	
	private String name;
	private int age;
	private String jobTitle;
	
	public void methodOne() {
		System.out.println("Name:      " + name);
		System.out.println("Age:       " + age);
		System.out.println("Job Title: " + jobTitle);
	}
	 
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	 

	
}
