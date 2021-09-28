package com.opps.constractor;

public class Assigning_static_final {

	// we can assign final or static variavle
	static int i;
	final int j;

	Assigning_static_final() {
		j = 20;
		i = 100;
	}

	{
		// j = 20;
		i = 100;
	}


	@Override
	public String toString() {
		return "Assigning_static_final [j=" + j +" i="+i+ "]";
	}




	public static void main(String[] args) {
       Assigning_static_final obj = new Assigning_static_final();
       System.out.println(obj.toString());
	}

}
