package com.Edison.Hasnain.CompareableStudent;

public class Student implements Comparable<Student> {
	
	private String firstName, lastName, address;
	private double GPA;
	
	public Student(String firstName, String lastName, String address, double GPA) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.GPA = GPA;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address; 
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public int compareTo(Student obj) {
		if (obj.getFirstName().equals(firstName))
		{
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		return "Student:\n" + firstName + " " + lastName + "\n" + address + "\n" + GPA;
	}
	
}
