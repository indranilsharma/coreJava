package com.datatype.array;

// program to implement 223=2+2+3=7 using recursion

public class degitSumUsingRecursion {
	
	int sum = 0;
    
    public int getNumberSum(int number){
         
        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
    public static void main(String a[]){
        degitSumUsingRecursion mns = new degitSumUsingRecursion();
        System.out.println("Sum is: "+mns.getNumberSum(2235));
    }

}
