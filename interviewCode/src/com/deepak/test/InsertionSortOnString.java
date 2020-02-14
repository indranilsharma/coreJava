package com.deepak.test;

public class InsertionSortOnString {
    public static void main(String[] args) {
        String stringToBeSorted= "java";
        //String stringToBeSorted= "javaMadeSoEasy"; //Test String
        System.out.println(sort(stringToBeSorted));
        
 }
 
 static String sort(String s) {
        int tempPos;
        char ch[] = s.toCharArray();

        // Insertion Sort - to perform sorting
        for (int i = ch.length - 1; i > 0; i--) {
               tempPos = i;
               for (int j = i; j > 0; j--) {
                     if (ch[j - 1] > ch[tempPos]) {
                            tempPos = j - 1;
                     }

               }
               swap(ch, tempPos, i);
        }

        return new String(ch);
 }
 
 static void swap(char ch[],int tempPos,int i){
        char temp=ch[tempPos];
        ch[tempPos]=ch[i];
        ch[i]=temp;
 }

}

/*OUTPUT

aajv

*/