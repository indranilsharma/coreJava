package com.JavaLang.LocalClasses;

import java.util.Locale;

/*Construct a locale from language and country.
* This constructor normalizes the language value to lowercase and
* the country value to uppercase.*/


/*Returns the country/region code for this locale, which should
* either be the empty string, an uppercase ISO 3166 2-letter code,
* or a UN M.49 3-digit code.*/



public class Manager2 {
	
    public static void main(String args[]) {

        Locale obj = new Locale("HINDI", "INDIA") ;
        System.out.print(obj.getCountry());

    }
}
