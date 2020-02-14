package com.fileHandling;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter {

	public void callfuntion() {

		File file = new File("/home/indranils@sawridge.com/scjp-code-interview/scjpCode/resources/");  //only directory 

		String[] fileName = file.list(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".txt")) {
					return true;
				}
				return false;
			}
		});

		for (String string : fileName) {
			System.out.println(string);
		}

	}

	public static void main(String[] args) {
		MyFileFilter filter = new MyFileFilter();
		filter.callfuntion();
	}
}
