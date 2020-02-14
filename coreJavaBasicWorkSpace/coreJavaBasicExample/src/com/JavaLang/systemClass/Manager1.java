package com.JavaLang.systemClass;


/*Returns the current time in milliseconds.  Note that
* while the unit of time of the return value is a millisecond,
* the granularity of the value depends on the underlying
* operating system and may be larger.  For example, many
* operating systems measure time in units of tens of
* milliseconds.

@return  the difference, measured in milliseconds, between
	     *          the current time and midnight, January 1, 1970 UTC.
	     * @see     java.util.Date
	     * registration-Id genaration we are using it.
*/

public class Manager1 {
	
	public static void main(String args[]) {

		long start, end;
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++);
		end = System.currentTimeMillis();
		System.out.print(end - start);

	}
}
