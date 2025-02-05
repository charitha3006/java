package com.wipro.java.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("somefile.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getStackTrace());
		}
		

	}

}
