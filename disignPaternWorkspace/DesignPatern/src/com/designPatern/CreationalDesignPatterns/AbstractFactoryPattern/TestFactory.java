package com.designPatern.CreationalDesignPatterns.AbstractFactoryPattern;

public class TestFactory {

	private static void testFactory() {
		SuperClass subClass = ConsumerClass.getSuperClass(new SubClassOneFactory("propertyOne:1", "propertyTwo:2"));
		System.out.println("SuperClassFactory Subclass" + subClass);
		System.out.println("SuperClassFactory Subclass" + subClass);
	}

	public static void main(String[] args) {
		testFactory();
	}

}
