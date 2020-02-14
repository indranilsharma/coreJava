/*Input :  string = "this is a test string"
         pattern = "tist"
Output :  Minimum window is "t stri"
Explanation: "t stri" contains all the characters
              of pattern.

Input :  string = "geeksforgeeks"
         pattern = "ork" 
Output :  Minimum window is "ksfor"

*Find the smallest window in a string containing all characters of another string
*/

package com.dataStucture.ElementaryDataStructures.strings.CharacterCounting;

public class FindSubString {

	static final int no_of_chars = 256;

	public static void findSubStringMinWindow(String inputString, String matchPattren) {
		int inputStringLength = inputString.length();
		int matchPattrenLength = matchPattren.length();
		int[] pattrenStoreArray = new int[no_of_chars];
		int[] inputStringStoreArray = new int[no_of_chars];
		int result = 0;
		int count = 0;
		if (inputStringLength < matchPattrenLength) {
			System.out.println("too small to match :" + inputString);
		}

		for (int i = 0; i < matchPattrenLength; i++) {
			pattrenStoreArray[matchPattren.charAt(i)]++;
		}

		for (int i = 0; i < inputStringLength; i++) {
			inputStringStoreArray[inputString.charAt(i)]++;
		}
		for (int i = 0; i < inputStringStoreArray.length; i++) {

			for (int j = 0; j < pattrenStoreArray.length; j++) {

				if (inputStringStoreArray[i] == pattrenStoreArray[j]) {
					count++;
					result = inputStringStoreArray[i];
				}
			}

		}
		System.out.println(count + " count " + result);

	}

	public static void main(String[] args) {
		String inputString = "this is a test string";
		String matchPattren = "tist";
		findSubStringMinWindow(inputString, matchPattren);
	}
}
