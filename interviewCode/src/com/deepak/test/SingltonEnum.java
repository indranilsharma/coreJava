package com.deepak.test;

public enum SingltonEnum {
	 INSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
