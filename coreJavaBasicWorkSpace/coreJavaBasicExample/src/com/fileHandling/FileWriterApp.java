package com.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {

	public static void main(String[] args) {

		FileWriter fileWriter1;
		FileWriter fileWriter2;
		try {
			fileWriter1 = new FileWriter("/home/indranils@sawridge.com/scjp-code-interview/scjpCode/resources/op4.txt"); 
			fileWriter2 = new FileWriter("/home/indranils@sawridge.com/scjp-code-interview/scjpCode/resources/op2.txt",true); 
			fileWriter2.write("tambora");
			fileWriter2.write('b');
			fileWriter2.write(1);
			fileWriter1.write("india");
			System.out.println("file created");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}