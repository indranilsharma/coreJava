
/*Return maximum occurring character in an input string
 
Input string = “test”

1: Construct character count array from the input string.
  count['e'] = 1
  count['s'] = 1
  count['t'] = 2
  
2: Return the index of maximum value in count array (returns ‘t’).
*/
package com.dataStucture.ElementaryDataStructures.strings.CharacterCounting;

public class GetMaxOccuringChar {

	public static void getMaxOccuringChar(String inputArray, char elementTobesearch) {

		int count = 0;
		char result = 'a';

		for (int i = 0; i < inputArray.length(); i++) {

			if (inputArray.charAt(i) == elementTobesearch) {
				result = inputArray.charAt(i);
				count++;
			}
		}
		System.out.println("Max occurring character is :" + result + " number of ocarence is : " + count);

	}

	public static void main(String[] args) {
		String inputArray = "saample strinaag";
		char elementTobesearch = 'a';
		getMaxOccuringChar(inputArray, elementTobesearch);

	}

	// code
	// link:http://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/

	/*
	 * static final int ASCII_SIZE = 256; static char getMaxOccuringChar(String
	 * str) { // Create array to keep the count of individual // characters and
	 * initialize the array as 0 int count[] = new int[ASCII_SIZE];
	 * 
	 * // Construct character count array from the input // string. int len =
	 * str.length(); for (int i=0; i<len; i++) count[str.charAt(i)]++;
	 * 
	 * int max = -1; // Initialize max count char result = ' '; // Initialize
	 * result
	 * 
	 * // Traversing through the string and maintaining // the count of each
	 * character for (int i = 0; i < len; i++) { if (max < count[str.charAt(i)])
	 * { max = count[str.charAt(i)]; result = str.charAt(i); } } //
	 * System.out.println(count.toString()); return result; }
	 * 
	 * // Driver Method public static void main(String[] args) { String str =
	 * "mple ring"; System.out.println("Max occurring character is " +
	 * getMaxOccuringChar(str)); }
	 */

}