package com.estio.week2;

import java.util.ArrayList;
import java.util.List;

public class ForLoops
{
    /**
     *      * @param args
     *      This is a simple main method that will use some for loop examples
     */
    public static void main(String[] args)
    {
        // print out 1 to 10 using a for loop
        /*for(int x = 0; x <= 10 ; x+=3 )
        {

            if(x > 1 && x < 10)
            {
                System.out.print(x + ",");
            }
            else
            {
                System.out.print(x + ".");
            }
        }*/

//        numbersTable();

        forEachExample();

    }

    public static void forEachExample()
    {
/*        List<String> names = new ArrayList<String>();
        names.add("Shelly");
        names.add("Josh");
        names.add("Tyler");
        names.add("Matt");

        // print out all names
        for(String name : names)
        {
            System.out.println(name);
        }*/

        List<Integer> numbers = new ArrayList<Integer>();

        String[] names = {"Tyler", "Will", "Shelly", "Josh"};
        System.out.println(names.length);

        for(int x = 0; x < names.length; x++)
        {
            System.out.println( names[x] );
        }



        int sum =0;
        // add 5 numbers to the list
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        for (Integer number: numbers )
        {
            sum += number;
        }

        System.out.println("The sum of the numbers is:" + sum);


   }


    /**
     * This method will give us some examples of using a for loop for
     * different things.
     *
     * @param name
     * @param age
     */
    public static void makeSomeForLoops(String name, int age)
    {
        System.out.println("Some for loops");
    }

    public static void numbersTable()
    {

        for (int x = 1 ; x <= 10 ; x++)
        {
            System.out.println(x);
                for(int y=1 ; y<=10 ; y++)
                {
                    System.out.println("X: " + x + "Y:" + y);
                }
            System.out.println();
        }
    }

    public static void extraLoopTask()
    {

    }


}
