package com.java8newfeature.common.funtinalInterface;

@FunctionalInterface
interface FuntinalInterfaceDemoDefault {
	void sam();

	default void concreate() {
		System.out.println("i am default");
	}

	static void iamStatic() {
		System.out.println("i am static");
	}
}

public class FuntinalInterfaceSAMDefault implements FuntinalInterfaceDemoDefault {

	@Override
	public void sam() {
		System.out.println("SAM - Implemented");
	}

	public static void main(String[] args) {
		FuntinalInterfaceSAMDefault samObj = new FuntinalInterfaceSAMDefault();
		samObj.sam();
		samObj.concreate();
		FuntinalInterfaceDemoDefault.iamStatic();

	}

}
