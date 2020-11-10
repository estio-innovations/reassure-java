package com.estio.week3.dom;

public class ToStringBasics {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("Start");
      Object obj = new Object().toString();

      System.out.println(sb.reverse().toString());
      System.out.println(obj);

      //@Override
      //public String toString()
      //This will override the master class

      String w = "Hello";
      String v = "Hello";
      System.out.println(w == v);
      //Redundant code is the toString
      // System.out.println(x.toString() == y.toString());


      String x = "Hello World";
      String y = "Hello World".trim();
      String z = "Hello World".toLowerCase();
      System.out.println(x == y);
      System.out.println(x == z);


   }
}