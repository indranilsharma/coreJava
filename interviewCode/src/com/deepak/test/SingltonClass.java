package com.deepak.test;

public class SingltonClass {
	public static void main(String[] args) {
        SingltonEnum singleton = SingltonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
