package com.operators.unaryOparator.unaryoparator;

/**
 *
 * @author root
 */
public class Manager1 {

    public static void main(String[] args) {
        int i = 0;
        int j=0;
        int k=i++;
        System.out.println(i++);//1
        System.out.println(i);// 2 next uses
        System.out.println(j--);//0
        System.out.println(j);//-1
        System.out.println(k);//0
    }
}