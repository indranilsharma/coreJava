/*
  boolean no size no renge;
  byte 1 byte;
  char 1 byte;
  short 2 byte;
  int 4 byte;
  long 8 byte;
  float 4 byte;
  double 8 byte;
  Object o;
*/
package com.datatype.primitive.numaric.integer;

/**
 *
 * default value
  boolean false;
  byte 0;
  char [];
  short 0;
  int 0;
  long 0;
  float 0.0;
  double 0.0;
  Object null;
 * 
 */
public class Manager2 {
  boolean bo;
  byte by;
  char c;
  short s;
  int i;
  long l;
  float f;
  double d;
  Object o;
public static void main(String[] args) {
    Manager2 app = new Manager2();
    app.run();
  }

  void run() {
    int[] intArray = new int[2];
    Object[] objectArray = new Object[2];
    System.out.println("boolean: " + bo);
    System.out.println("byte: " + by);
    System.out.println("char: " + c);
    System.out.println("short: " + s);
    System.out.println("int: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
    System.out.println("Object: " + o);
    System.out.println("int[2]: " + intArray[0] + " " + intArray[1]);
    System.out.println("Object[2]: " + objectArray[0] + " " + objectArray[1]);
  }
}