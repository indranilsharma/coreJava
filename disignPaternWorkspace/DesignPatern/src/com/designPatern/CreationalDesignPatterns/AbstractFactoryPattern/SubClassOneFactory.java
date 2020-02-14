package com.designPatern.CreationalDesignPatterns.AbstractFactoryPattern;

public class SubClassOneFactory implements SuperClassFactory {

	private String propertyOne;
	private String propertyTwo;

	public SubClassOneFactory(String propertyOne, String propertyTwo) {
		//super();
		this.propertyOne = propertyOne;
		this.propertyTwo = propertyTwo;
	}

	@Override
	public SuperClass createSuperInstance() {
		return new SubClassOne("propertyOneInitisised", "propertyTwoInitisised");
	}

}
