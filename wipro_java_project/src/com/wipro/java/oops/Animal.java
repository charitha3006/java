/**
 * 
 */
package com.wipro.java.oops;
/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fields
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/
public class Animal {

	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private int age;
	private float weight;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
