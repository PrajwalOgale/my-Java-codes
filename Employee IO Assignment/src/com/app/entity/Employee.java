package com.app.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private Integer empID;
	private String name;
	private Double salary;
	private Department department;
	
	public Employee(Integer empID, String name, Double salary, Department department) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
	
	
}
