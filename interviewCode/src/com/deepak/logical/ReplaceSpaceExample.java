package com.deepak.logical;

public class ReplaceSpaceExample {
    public static void main(String[] args) {
           
           String input="java made so easy";
           System.out.println("entered string = "+input);
           System.out.println("output string  = "+replaceSpaces(input));
           
    }
 
    /*
     * Method replaces space with '$#$' in java
     */
 
    public static String replaceSpaces(String input) {
           char ch[]=input.toCharArray();
           int spaceCount = 0;
           for (int i = 0; i < ch.length; i++) {
                  if (ch[i] == ' ') {
                        spaceCount++;
                  }
           }
           
           int newLength = ch.length + spaceCount * 2;
           System.out.println(newLength);
           char chNew[]=new char[newLength] ;
           for (int i = ch.length - 1; i >= 0; i--) {
                  if (ch[i] == ' ') {
                        chNew[--newLength] = '$';
                        chNew[--newLength] = '#';
                        chNew[--newLength] = '$';
                  }
                  else
                        chNew[--newLength] = ch[i];
                  
           }
           return(new String(chNew));
    }
}