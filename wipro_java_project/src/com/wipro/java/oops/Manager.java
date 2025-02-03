package com.wipro.java.oops;

/**
 * Parent Class= Employee 
 * Child class =Manager
 * Extends =is a keyword 
 */
public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		Employee emp=new Manager();
		emp.setEmployeeId(403);
		emp.setEmployeeName("varshitha");
		emp.setSalary(100000f);
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeName());
		System.out.println(emp.getSalary());
	}

}
