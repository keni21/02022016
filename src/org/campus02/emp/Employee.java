package org.campus02.emp;

import java.util.ArrayList;

public class Employee {

	private int empNumber;
	private String name;
	private double salary;
	private String department;
	private String role;
	private Employee superior;
	private ArrayList<Employee> subordinates =new ArrayList<>();
	
	public Employee(int empNumber, String name, double salary, String department) {
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	
	public Employee(int empNumber, String name, double salary, String department, String role) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.role = role;
	}

	
	public void addSubordinates (Employee e)
	{
		subordinates.add(e);
	}

	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}


	public void setSubordinates(ArrayList<Employee> subordinates) {
		this.subordinates = subordinates;
	}


	public Employee getSuperior() {
		return superior;
	}


	public void setSuperior(Employee superior) {
		this.superior = superior;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + ", department="
				+ department + ", role=" + role + ", superior=" + superior + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNumber != other.empNumber)
			return false;
		return true;
	}
	
}
