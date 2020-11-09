package com.estio.datatypes.stringstuff;

public class StringExamples
{
    public static void main(String[] args)
    {
        String phrase = "adaptable";
        String part1 = phrase.substring(1, 3);

        String stringWord = "MGJACOLIPVINA";

        System.out.print("\n" +stringWord.substring(4, 6));
        System.out.print(stringWord.substring(0, 1));
        System.out.print(stringWord.substring(8, 9));
        System.out.print(stringWord.substring(7, 8));
        System.out.print(stringWord.substring(6, 7));
        System.out.print(stringWord.substring(10, 12));
        System.out.print(stringWord.substring(1, 2));
        System.out.print(" " +stringWord.substring(2, 3));
        System.out.print(stringWord.substring(3, 4));
        System.out.print(stringWord.substring(9, 10));
        System.out.print(stringWord.substring(12, 13));

        String usersInput = "Y";

        if(usersInput.toLowerCase().startsWith("y"))
        {

        }

        String sentence = "            How now\nBrown\nCow           ";

        System.out.println(sentence.trim());
    }
}
