/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
class circle{
	public void display() {
		System.out.println("This is a circle");
	}
}
class rectangle extends circle{
	public void display() {
		System.out.println("This is a rectangle");
	}
}
public class Shape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle o1=new rectangle();
		o1.display();

	}

}
