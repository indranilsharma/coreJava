package com.datatype.primitive.Char.Char;

/*
//Unicode representation of a character indicated by the leading "u" sequence. 
The numeric value is always a four-digit hexadecimal number in this format.

Escape Sequence    Character Represented

\b                 Backspace.
\t                 Horizontal tab
\n                 New line (line feed).
\f                 Form feed.
\r                 Carriage return.
\"                 Double quotation mark.
\'                 Single quotation mark.
\\                 Backslash.
\xxx               A character in octal representation; xxx must range from 000 through 377.
uxxxx             A Unicode character, where xxxx is a hexadecimal-format number.
*/


public class Manager2 {
	public static void main(String[] args) {
		char c1 = '\u0057'; // the letter W
		char c2 = 'W';
		char c3 = (char) 87; // the letter W
		char c4 = '\r'; // carriage return
		System.out.println(c1+" "+c2+" "+c3+" "+c4+" ");
	}
}
