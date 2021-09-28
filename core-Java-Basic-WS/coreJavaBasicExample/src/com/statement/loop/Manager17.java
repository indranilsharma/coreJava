package com.statement.loop;

public class Manager17 {
	public static void main(String[] args) {
		boolean finished = true;
		do {
			double d = Math.random();
			if (d > .5)
				finished = true;
			System.out.println(d);
		}
		while (!finished);//if we remove the ! loop will not terminate
		{
			System.out.println("hi");
		}
	}
}
