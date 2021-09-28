package com.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//ObjectGraph one object hold internally other object 
class Dog1 implements Serializable {

	Cat1 c = new Cat1();
}

class Cat1 implements Serializable {
	Rat1 r = new Rat1();
}

class Rat1 implements Serializable {
	Mongooes1 m = new Mongooes1();
}

class Mongooes1 implements Serializable {

	int i = 10;
	transient int j = 20;
}

public class ObjectGraph {

	public static void main(String[] args) throws FileNotFoundException {
		try {

			Dog1 d1 = new Dog1();
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);

			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog1 d2 = (Dog1)ois.readObject();
			
			System.out.println(d2.c.r.m.i + " "+d2.c.r.m.j);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
