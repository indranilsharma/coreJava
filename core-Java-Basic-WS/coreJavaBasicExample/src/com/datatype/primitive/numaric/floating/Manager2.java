
package com.datatype.primitive.numaric.floating;

/**
 *
 Operator ++ has more preference than *,
 thus g becomes 4 and when multiplied by 8 gives 32.
 */
public class Manager2 {

	/**
	 * @param args
	 *            the command line arguments
	 */

	public static void main(String args[]) 
    {        
         int g = 3;
         System.out.print(++g * 8);//the command line arguments
    } 
}
