package com.JavaLang.hasCode;

public class HashCodeDemo_Override {
	int id;
	
	public HashCodeDemo_Override(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		int encryId = (int) (Math.random()+(id*2))%3;
//		System.out.println( (Math.random()+(id*5)));
		return encryId;
	}
	
	@Override
	public String toString() {
		return "HashCodeDemo_Override  :"+ hashCode();
	}
	public static void main(String[] args) {
		HashCodeDemo_Override o = new HashCodeDemo_Override(100);
//		 internally toString() use hashCode() 
		System.out.println(o.toString());
		System.out.println(o.hashCode());
	}
}