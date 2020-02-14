package com.deepak.objectCreationWays;

public class ByReflectionApi {
	public void fun() {
		System.out.println("Object creation by reflection api");
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ByNewKeyWord obj = (ByNewKeyWord) Class.forName("com.deepak.objectCreationWays.ByReflectionAp.ByNewKeyword").newInstance();
		obj.fun();
	}
}
