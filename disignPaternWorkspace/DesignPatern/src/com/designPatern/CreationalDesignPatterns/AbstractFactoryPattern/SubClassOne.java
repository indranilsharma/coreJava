package com.designPatern.CreationalDesignPatterns.AbstractFactoryPattern;

public class SubClassOne extends SuperClass {

	private String propertyOne;

	private String propertyTwo;

	public SubClassOne(String propertyOne, String propertyTwo) {
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
