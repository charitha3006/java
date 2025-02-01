/**
 * 
 */
package com.wipro.java;

class MyClass {
    int num = 5;
 
    public void changeValue(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();//Creating Object for the class
        obj.changeValue(10);//Call the changeValue method by passing integer value
        System.out.println(obj.num);//Printing the number using the object
    }
}