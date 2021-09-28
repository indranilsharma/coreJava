package com.JavaLang.LocalClasses;

import java.util.Locale;

/*Returns the country/region code for this locale, which should
* either be the empty string, an uppercase ISO 3166 2-letter code,
* or a UN M.49 3-digit code.*/



public class Manager1 {
	
    public static void main(String args[]) {

        Locale obj = new Locale("India") ;
        System.out.print(obj.getCountry());
    }
}
