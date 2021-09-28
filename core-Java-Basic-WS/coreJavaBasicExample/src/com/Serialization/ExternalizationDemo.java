package com.Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {
	String s;
	int i;
	int j;

//	this should be must because in Externalization separate object will be created 
	public ExternalizationDemo() {
		System.out.println("public-no-age-construtor");
	}

	public ExternalizationDemo(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		partial object are save ..this is possible because of Externalization
		s = (String) in.readObject();
		i = in.readInt();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExternalizationDemo obj = new ExternalizationDemo("India", 44, 14);

		FileOutputStream fos = new FileOutputStream("abcd.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		FileInputStream fis = new FileInputStream("abcd.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo readObject = (ExternalizationDemo) ois.readObject();
		System.out.println(readObject.s + "---------" + readObject.i + "--------" + readObject.j);
	}

}