package com.designPatern.CreationalDesignPatterns.FactoryPattern;

public abstract class Computer {

	public abstract String getRAM();

	public abstract String getCPU();

	public abstract String getHD();

	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getCPU()=" + getCPU() + ", getHD()=" + getHD();

	}

}
