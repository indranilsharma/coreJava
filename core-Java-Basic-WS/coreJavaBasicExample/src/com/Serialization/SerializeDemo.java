package com.Serialization;

import java.io.*;

// class must implement Serializable
class Dog implements Serializable {

	int i = 10;
	int j = 20;
	
//	transient not to serialize..default value will be stored ..int default value ..0 will be stored 
	transient int k = 20;
//	 its class level variable not taking part of serialization.. 
	static int l = 20;
	  
//	no impact because staic are class level variable  
	transient static int m = 20;
//	final value will take place in serialization directly by its value
	final int n = 20;
	final transient int o = 20;	
}

public class SerializeDemo {
	public static void main(String[] args) throws Exception {
		Dog d = new Dog();

		System.out.println("Process of Serialization");

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(d);
		System.out.println("-------------");

		System.out.println("Process of deserialization");

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Dog d1 = (Dog) ois.readObject();
		System.out.println("int " + d1.i + "\nint :" + d1.j 
				+ "\ntransient :" + d1.k + "\nstatic :" + d1.l
				+ "\ntransient static :" + d1.m 
				+ "\nfinal :" + d1.n + "\nfinal transient :" + d1.o);
	}
}
