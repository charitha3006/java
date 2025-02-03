package com.wipro.java.oops.abstraction;

public class Tesla extends Car {
    public void type() {
    	System.out.println("Tesla");
    }
    public void drive() {
    	System.out.println("This car can drive on its own");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj2=new Tesla();
		obj2.type();
		obj2.drive();

	}

}
