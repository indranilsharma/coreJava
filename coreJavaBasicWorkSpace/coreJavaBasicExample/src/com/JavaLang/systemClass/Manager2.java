package com.JavaLang.systemClass;
/*
  @param      src      the source array.
* @param      srcPos   starting position in the source array.
* @param      dest     the destination array.
* @param      destPos  starting position in the destination data.
* @param      length   the number of array elements to be copied.
* @exception  IndexOutOfBoundsException  if copying would cause
*               access of data outside array bounds.
* @exception  ArrayStoreException  if an element in the <code>src</code>
*               array could not be stored into the <code>dest</code> array
*               because of a type mismatch.
* @exception  NullPointerException if either <code>src</code> or
*               <code>dest</code> is <code>null</code>.
*
public static native void 
                  arraycopy(Object src,int  srcPos,Object dest,int destPos,int length);

*/

public class Manager2 {
	public static void main(String args[]) {

		byte a[] = { 65, 66, 67, 68, 69, 70 };
		byte b[] = { 71, 72, 73, 74, 75, 76 };
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.print(new String(a) + " " + new String(b));
	}
}
