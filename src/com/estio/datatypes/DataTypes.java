package com.estio.datatypes;


import java.util.ArrayList;

public class DataTypes
{
    String myString;
    ArrayList myArray;

    public static void main(String[] args)
    {
        String word = "Boom";

        String string = "animals";
        String anotherString = "Are you awake?".toUpperCase();

        System.out.println(string.toLowerCase());



        System.out.println("Are you awake?".toUpperCase());



//        System.out.println(word.concat(" something else"));
        System.out.println(word);


        String otherWord = word;

        otherWord = "Java";
        System.out.println(word);

        String newWord = otherWord;

        System.out.println("NewWord" + newWord);
        System.out.println("Original" + word);


        int i = 1;
        int[] iArr = {1};
        incr(i) ;
        incr(iArr) ;
        System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
    }
        public static void incr(int   n ) { n++ ; }
        public static void incr(int[ ] n ) { n [ 0 ]++ ; }

    }


