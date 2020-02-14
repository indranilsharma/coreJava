package com.Serialization;

import java.io.*;

class Dog implements Serializable
{
	int i=10;
	int j=20;
	//transient int j=20;
	//static int j=20;
	//transient static int j=20;
	//final value will take place in serilization directly by its value
	//final int j=20;
	//final transient int j=20;
	
	
}

public class SerializeDemo {
	public static void main(String[] args) throws Exception{
		Dog d=new Dog();
		
				
			System.out.println("Process of Serialization");
			FileOutputStream fos=new FileOutputStream("abc.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d);
			System.out.println("-------------");
			System.out.println("Process of deserialization");
			FileInputStream fis=new FileInputStream("abc.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Dog d1=(Dog)ois.readObject();
			System.out.println(d1.i+ ":" +d1.j);
			
			
		
		} 
		
	

}
