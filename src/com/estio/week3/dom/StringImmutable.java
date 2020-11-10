package com.estio.week3.dom ;

public class StringImmutable {
   public static void main(String[] args) {
      String mYString = new String("Start");

      //You can not change the string this way as they are immutable
      //you have to create a new string literal to get it to change
      //String x = mYString + "+Middle"
      mYString.concat("+Middle");
      mYString.concat("+End");

      System.out.println(mYString);
   }
}