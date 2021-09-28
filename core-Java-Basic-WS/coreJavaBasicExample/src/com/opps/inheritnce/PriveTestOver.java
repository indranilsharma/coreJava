package com.opps.inheritnce;

//override private method
class PriveTestOver {

	private void print() {
		System.out.println("Base");
	}

	class Inner extends PriveTestOver {

		private void print() {
			System.out.println("Inner");
		}
	}
	
	public static void main(String[] args) {
		
		PriveTestOver o = new PriveTestOver();
		Inner i = o.new Inner();
		i.print();
		o.print();
	}	
}
