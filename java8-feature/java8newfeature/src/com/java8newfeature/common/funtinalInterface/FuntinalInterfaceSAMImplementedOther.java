package com.java8newfeature.common.funtinalInterface;

interface NoAbstractMethod {
	
	// it not allowed because  implemented by @FunctionalInterface and should not allowed 
	// void sam();

	default void defalutMethod() {
		System.out.println("default method");
	}
}

@FunctionalInterface
interface FuntinalInterfaceSAMImplementedOtherInterface extends NoAbstractMethod {
	void samOne();

	default void defalutMethodSAM() {
		System.out.println("SAM - Default Method");
	}
}

public class FuntinalInterfaceSAMImplementedOther implements FuntinalInterfaceSAMImplementedOtherInterface {

	@Override
	public void samOne() {
		System.out.println("SAM - implementd");
	}

	public static void main(String[] args) {
		FuntinalInterfaceSAMImplementedOther other = new FuntinalInterfaceSAMImplementedOther();
		other.samOne();
		other.defalutMethodSAM();
		other.defalutMethod();
	}

}
