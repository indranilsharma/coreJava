package com.wrappersClass.Boolean;

/*Returns a {@code Boolean} with a value represented by the
* specified string.  The {@code Boolean} returned represents a
* true value if the string argument is not {@code null}
* and is equal, ignoring case, to the string {@code "true"}.
*
* @param   s   a string.
* @return  the {@code Boolean} value represented by the string.
*/

/* valueOf() returns true if the specified string contains “true” 
 * in lower or uppercase and false otherwise.
 */

public class Manager2 {
	public static void main(String args[]) {

		String str = "true false true";
		boolean x = Boolean.valueOf(str);
		System.out.print(x);

	}
}
