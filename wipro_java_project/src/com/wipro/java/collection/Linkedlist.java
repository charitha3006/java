package com.wipro.java.collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> ls=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			ls.add(sc.nextInt());
		}
		//printing lined list
		System.out.println(ls);
		//remove element at the index 3
		ls.remove(3);
		System.out.println(ls);
		//adding element 6 at last index
		ls.add(6);
		System.out.println(ls);
		//get element one by one
		System.out.println(ls.get(3));
	}

}
