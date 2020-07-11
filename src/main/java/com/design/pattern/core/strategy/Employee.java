package com.design.pattern.core.strategy;

/**
 * 
 * @author almed
 *
 */
public class Employee {
	
	private String firsname;
	private String lastname;
	private double salary;
	private Bonus bonus;
	
	public Employee() {
		this(null, null, null, new NoBonus());
	}
	
	public Employee(String firsname, String lastname, Double salary) {
		this(firsname, lastname, salary, new NoBonus());
	}

	public Employee(String firsname, String lastname, Double salary, Bonus bonus) {
		this.firsname = firsname;
		this.lastname = lastname;
		this.salary = salary;
		this.bonus = bonus;
	}

	public String getFirsname() {
		return firsname;
	}

	public void setFirsname(String firsname) {
		this.firsname = firsname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Double getSalary() {
		return salary + salary * bonus.bonus();
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Bonus getBonus() {
		return bonus;
	}

	public void setBonus(Bonus bonus) {
		this.bonus = bonus;
	}

}
