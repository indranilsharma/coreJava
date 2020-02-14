/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opps.inheritnce;

/**
 *
 * @author root
 */
class H {

    H() {
        this(10);
        System.out.println("D()");
    }

    H(int i) {
        System.out.println("D(int i)");
    }
}

class F extends H {

    F() {
        super(7);
        System.out.println("D()");
    }

    F(int i) {
        System.out.println("D(int i)");
    }
}

class G extends F {

    G() {
        super(2);
        //this();//super and this can't use at a time
        System.out.println("E()");
    }
}

public class Manager4 {

    public static void main(String[] args) {
        F f = new F();
        System.out.println("............");
        G g = new G();
        System.out.println(".............");
    }

}
