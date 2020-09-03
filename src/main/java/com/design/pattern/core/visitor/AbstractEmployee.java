package com.design.pattern.core.visitor;

/**
 * 
 * @author almed
 *
 */
public abstract class AbstractEmployee {
	
	private String firstname;
	private String lastname;
	private double salary;
	private int seniorityYears;
	
	
	public AbstractEmployee(String firstname, String lastname, double salary, int seniorityYears) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.seniorityYears = seniorityYears;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getSeniorityYears() {
		return seniorityYears;
	}
	public void setSeniorityYears(int seniorityYears) {
		this.seniorityYears = seniorityYears;
	}
	
}
