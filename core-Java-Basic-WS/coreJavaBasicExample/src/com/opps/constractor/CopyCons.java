package com.opps.constractor;

public class CopyCons {

	int i, j;

	public CopyCons(int i, int j) {
		System.out.println("Constuctor called");
		this.i = i;
		this.j = j;
	}

	//copy constructor
	public CopyCons(CopyCons c) {
		System.out.println("Copy constructor called");
		i = c.i;
		j = c.j;
	}

	@Override
	public String toString() {
		return "CopyCons [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) {

		CopyCons c1 = new CopyCons(1, 5);
         
		//copy cons call
		CopyCons c2 = new CopyCons(c1);
        
		System.out.println(c2);
		
	}

}
