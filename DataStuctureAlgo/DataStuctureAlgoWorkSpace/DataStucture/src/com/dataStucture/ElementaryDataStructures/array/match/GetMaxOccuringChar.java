package com.dataStucture.ElementaryDataStructures.array.match;

public class GetMaxOccuringChar {

	public void getMaxOccuringChar(int array[]) {
	
		for (int i = 0; i < array.length; i++) {
			int count =0;
			
			for (int j =0; j < array.length - 1; j++) {
				
				
				if (array[i] == array[j]) {
					
					//System.out.println(array[j] + " :" + i);
					count ++;
					System.out.println(count +" :"+ array [j]);
										
				}
			//	else
					//break;
					//System.out.println("not match");
					//System.out.println(array[i] + " :" + i);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 77,4, 5, 8, 66, 32, 4, 5, 8 ,88};
		GetMaxOccuringChar maxOccuringChar = new GetMaxOccuringChar();
		maxOccuringChar.getMaxOccuringChar(array);
		// System.out.println("hi");
	}
}