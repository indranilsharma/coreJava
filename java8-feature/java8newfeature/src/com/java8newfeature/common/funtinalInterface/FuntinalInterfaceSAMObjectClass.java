package com.java8newfeature.common.funtinalInterface;

@FunctionalInterface
interface FuntinalInterfaceObjectClass {

	void sam();

	
	//can't be override 
	/*default int hashCode() {
		System.out.println("hi");
	}*/

	String toString();
}

public class FuntinalInterfaceSAMObjectClass implements FuntinalInterfaceObjectClass {

	@Override
	public void sam() {
		System.out.println("SAM - implemented");
	}

	public static void main(String[] args) {
		FuntinalInterfaceSAMObjectClass objectClass = new FuntinalInterfaceSAMObjectClass();
		objectClass.sam();
		objectClass.hashCode();
		objectClass.toString();
	}
}
