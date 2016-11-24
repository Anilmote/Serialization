package com.mankraft;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main(String args[]) throws Exception {
		Apple a = new Apple();
		a.setNumber(77);
		a.setType("Fruit");

		FileOutputStream fos = new FileOutputStream("record.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
	
		FileInputStream fis=new FileInputStream ("record.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Apple a1=(Apple)ois.readObject();
		
		System.out.println("Number of Apples:"+a1.getNumber());
		System.out.println("Type of Apple:"+a1.getType());
	}
	
}

class Apple implements Serializable {
	private int number;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}