package com.fileHandling;

import java.io.File;

public class FileListFromFolder {

	public File file = new File("/home/indranils@sawridge.com/Documents");

	public void fileName() {
		String[] listOfFile = file.list();

		for (String string : listOfFile) {
			System.out.println(string);
		}
	}

	public void fileNameAsObject() {
		File [] listOfFile = file.listFiles();
		for (File file : listOfFile) {
			System.out.println(file.getName());
		}
	}

	public static void main(String[] args) {
		FileListFromFolder fileListFromFolder = new FileListFromFolder();
		fileListFromFolder.fileName();
		System.out.println("mmmmmmmmmmmmmmmm");
		fileListFromFolder.fileNameAsObject();
	}
}