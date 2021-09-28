package com.JavaLang.LocalClasses;

import java.util.Locale;

/*Returns a name for the locale's language that is appropriate for display to the
* user.
*/


public class Manager4 {
	
    public static void main(String args[]) {

        Locale obj = new Locale("HINDI", "INDIA") ;

        System.out.print(obj.getDisplayLanguage());
    }
}
