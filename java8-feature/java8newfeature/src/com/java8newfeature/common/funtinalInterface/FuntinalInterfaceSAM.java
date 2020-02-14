package com.java8newfeature.common.funtinalInterface;

@FunctionalInterface
interface FuntinalInterfaceDemo {
	void sam();
	//Functional interface can have only one  abstract method 
	//void samOne();
}

public class FuntinalInterfaceSAM implements FuntinalInterfaceDemo {

	@Override
	public void sam() {
		System.out.println("SAM - Implemented");
	}

	public static void main(String[] args) {
		FuntinalInterfaceSAM samObj = new FuntinalInterfaceSAM();
		samObj.sam();
	}

}
