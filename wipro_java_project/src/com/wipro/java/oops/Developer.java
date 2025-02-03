package com.wipro.java.oops;
/**
 * Parent Class= Employee 
 * Child class =Developer
 * Extends =is a keyword 
 */
public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		Employee emp=new Developer();
		emp.setEmployeeId(401);
		emp.setEmployeeName("Gurijala");
		emp.setSalary(29000f);
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeName());
		System.out.println(emp.getSalary());
	}
	
}
	
