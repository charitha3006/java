/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Creta extends Car {
     public void type() {
		System.out.println("Creta");
    	 
     }
     public void drive() {
    	 System.out.println("This car can not drive on its own");
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Creta();
		obj1.type();
		obj1.drive();

	}

}
