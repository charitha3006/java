package com.wipro.java.oops.inheritance;

/**
 * Parent Class= Employee 
 * Child class =ProjectLead
 * Extends =is a keyword 
 */
public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		Employee emp=new ProjectLead();
		emp.setEmployeeId(402);
		emp.setEmployeeName("Charitha");
		emp.setSalary(39000f);
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeName());
		System.out.println(emp.getSalary());
	}

}
