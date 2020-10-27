package com.estio.week2;

public class ForLoops
{
    /**
     *      * @param args
     *      This is a simple main method that will use some for loop examples
     */
    public static void main(String[] args)
    {
        // print out 1 to 10 using a for loop
        for(int x = 0; x <= 10 ; x+=3 )
        {

            if(x > 1 && x < 10)
            {
                System.out.print(x + ",");
            }
            else
            {
                System.out.print(x + ".");
            }
        }

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
            // create another loop
            for (int y = 0; y <= 10 ; y++)
            {
                System.out.println(x + "\t"+ y + "\t" );
            }

        }
    }


}
