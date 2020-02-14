package com.dataStucture.ElementaryDataStructures.array.rotation;

public class MinimumMoveEndArrayOp {

	public void areRotatableString(String s1, String s2) {

		if ((s1.length() == s2.length()) && ((s1 + s2).indexOf(s2) != -1)) {
			System.out.println("are identical");
		} else {
			System.out.println("not able parmutable");
		}
	}

	/*
	 * public void areRotatableArray(String[] s) { for (int i = 0; i < s.length;
	 * i++) { String s1 = s[i]; for (int j = 0; j < s.length; j++) { String s2 =
	 * s[j]; String temp = (s1.concat(s2)).indexOf(s[]j); if (temp == -1) {
	 * System.out.println("not possible"); } else {
	 * System.out.println("possible");
	 * 
	 * } //System.out.print(s2); } System.out.println(s1); } }
	 */

	public static void main(String[] args) {
		// String arr[] = { "xzzwo", "zwoxz", "zzwox", "xzzwo" };

		MinimumMoveEndArrayOp obj = new MinimumMoveEndArrayOp();
		// obj.areRotatableArray(arr);
		obj.areRotatableString("xzzwo", "zwoxz");

	}

}
