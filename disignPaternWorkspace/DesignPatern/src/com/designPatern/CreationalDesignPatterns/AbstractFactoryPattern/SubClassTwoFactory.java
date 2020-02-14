package com.designPatern.CreationalDesignPatterns.AbstractFactoryPattern;

public class SubClassTwoFactory implements SuperClassFactory {

	private String propertyOne;
	private String propertyTwo;

	public SubClassTwoFactory(String propertyOne, String propertyTwo) {
		//super();
		this.propertyOne = propertyOne;
		this.propertyTwo = propertyTwo;
	}

	@Override
	public SuperClass createSuperInstance() {
		return new SubClassTwo("propertyOneInitisised", "propertyTwoInitisised");
	}

}
