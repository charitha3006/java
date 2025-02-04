package com.wipro.java.interface1;

public class TextFile implements Readable,Writeable{
	public void read() {
		System.out.println("This file can be read");
	}
	public void write() {
		System.out.println("This file can be written");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFile tf=new TextFile();
		tf.read();
		tf.write();
		

	}

}
