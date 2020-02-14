package com.designPatern.CreationalDesignPatterns.AbstractFactoryPattern;

public abstract class SuperClass {

	public abstract String getProppertyOne();

	public abstract String getProppertyTwo();

	@Override
	public String toString() {
		return "SuperClass [getProppertyOne()=" + getProppertyOne() + ", getProppertyTwo()=" + getProppertyTwo() + "]";
	}

}
