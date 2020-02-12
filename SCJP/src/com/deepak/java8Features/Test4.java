package com.deepak.java8Features;

class Sample
{
	Sample(String s)
	{
		System.out.println("sample class construtor with argumrnt "+s);
	}
}
interface infra1
{
	public Sample get(String s);
}
public class Test4 {
	public static void main(String[] args) {
		infra1 i =Sample::new;
		Sample s1 = i.get("ram");
		
	}

}
