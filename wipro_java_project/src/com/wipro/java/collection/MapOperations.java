package com.wipro.java.collection;
import java.util.*;
public class MapOperations {
	public static void main(String args[]) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1, "Apple");
		mp.put(2, "Mango");
		mp.put(3, "Banana");
		//getting values using keys
		System.out.println(mp.get(1));
		System.out.println(mp.get(2));
		if(mp.containsKey(2)) {
			System.out.println(mp.get(2));
		}
		//iterating map
		for(Map.Entry<Integer,String> entry:mp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		//removing values
		mp.remove(3);
		System.out.println();
		for(Map.Entry<Integer,String> entry:mp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
