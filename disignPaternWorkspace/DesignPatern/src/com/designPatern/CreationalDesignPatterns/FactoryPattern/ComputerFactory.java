package com.designPatern.CreationalDesignPatterns.FactoryPattern;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String cpu, String hd) {

		if ("PC".equalsIgnoreCase("PC")) {
			return new PC(ram, cpu, hd);
		} else if ("SERVER".equalsIgnoreCase("SERVER")) {
			return new Server(ram, cpu, hd);
		}

		return null;
	}
}
