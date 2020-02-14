package com.designPatern.CreationalDesignPatterns.AbstractFactoryPattern;

public class SubClassTwo extends SuperClass {
	private String propertyOne;

	private String propertyTwo;

	public SubClassTwo(String propertyOne, String propertyTwo) {
		this.propertyOne = propertyOne;
		this.propertyTwo = propertyTwo;
	}

	@Override
	public String getProppertyOne() {
		return this.propertyOne;
	}

	@Override
	public String getProppertyTwo() {
		return this.propertyTwo;
	}

}
