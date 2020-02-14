package com.designPatern.CreationalDesignPatterns.BuilderPattern;

public class TestBuilderPattern {
	public static void main(String[] args) {
		ComputerClass computerClass = new ComputerClass.ComputerBuilder("500GB", "HP").setBlothoothEnable(true)
				.setCameraEnable(true).build();
		System.out.println(computerClass.toString());
	}
}
