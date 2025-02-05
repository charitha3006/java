package com.wipro.java.oops;

public class Library {
    public static void main(String[] args) {
        // Create book objects using polymorphism
        Book fiction = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic");
        Book nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari", 2011, "History");

        // Display book information
        fiction.displayInfo();
        nonFiction.displayInfo();
    }
}