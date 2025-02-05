package com.wipro.java.interface1;

public class Lion implements Animal {
    public void show() {
    	System.out.println("This is lion ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Lion();
		obj.show();
	}

}
