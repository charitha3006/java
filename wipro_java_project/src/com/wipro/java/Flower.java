/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	String name;
	String colour;
	public Flower(String name,String colour) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.colour=colour;
	}
	/**
	 * @param args
	 */
	public void display() {
		System.out.println("The name of flower is "+name+" its colour is "+colour);	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower obj1=new Flower("Rose","Red");
		Flower obj2=new Flower("Jasmine","White");
		obj1.display();
		obj2.display();
		

	}

}
