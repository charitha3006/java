package com.wipro.java.exception;

public class Exptn {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		try {
			c=20/0;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Code is executed");
		}

		
		

	}

}
