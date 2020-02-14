package com.designPatern.CreationalDesignPatterns.AbstractFactoryPattern;

public class ConsumerClass {
public static SuperClass getSuperClass(SuperClassFactory factory) {
	return factory.createSuperInstance();
}
}
