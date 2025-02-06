/**
 * 
 */
package com.wipro.java.collection;
import java.util.*;
/**
 * 
 */
class Movie implements Comparable<Movie> {

	/**
	 * 
	 */
	public String name;
	/**
	 * @return the name
	 */
	
	public int rate;
	public int year;
	
	public Movie(String name,int rate,int year) {
		
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rate=rate;
		this.year=year;
	}
	public int compareTo(Movie m) {
		return this.rate-m.rate;
	}

	/**
	 * @param args
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> al=new ArrayList<>();
		al.add(new Movie("Star wars",8,1977));
		al.add(new Movie("Return to island",7,1988));
		al.add(new Movie("Maverrick",9,1977));
		Collections.sort(al);
		for(Movie m:al) {
			System.out.println(m.getName()+" "+m.getRate()+" "+m.getYear());
		}
		

	}

}
