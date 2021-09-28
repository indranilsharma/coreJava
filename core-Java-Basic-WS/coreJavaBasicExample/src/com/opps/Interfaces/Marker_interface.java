package com.opps.Interfaces;

public class Marker_interface implements Cloneable {

	/*
	 * It is an empty interface (no field or methods). Examples of marker
	 * interface are Serializable, Clonnable and Remote interface. All these
	 * interfaces are empty interfaces.
	 */
	
	int i;
	String s;

	public Marker_interface(int i, String s) {
		this.i = i;
		this.s = s;
	}

	// Overriding clone() method 
    // by simply calling Object class 
    // clone() method.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Marker_interface obj = new Marker_interface(1, "fight");

		// cloning 'obj' and holding
		// new cloned object reference in clon
		// down-casting as clone() return type is Object
		
		Marker_interface clone = (Marker_interface) obj.clone();

		System.out.println(clone.i);
		System.out.println(clone.s);
	}
}
