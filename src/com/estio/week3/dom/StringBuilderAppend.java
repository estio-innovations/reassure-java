package com.estio.week3.dom ;

public class StringBuilderAppend {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("Start");

      //StringBuilder makes it possible to change the string
      //whilst it creates a single object it will create more
      //objects in the heap and memory allocation.
      sb.append("+Middle");
      sb.append("+End");

      System.out.println(sb);
   }
}