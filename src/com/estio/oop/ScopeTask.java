package com.estio.oop;

public class ScopeTask
{
    public static boolean isHungry(boolean isHungry)
    {
        boolean hungryTest;

        if(isHungry == true)
        {
            hungryTest = true;
        }
        else
        {
            hungryTest = false;
        }
        return hungryTest;
    }

    public static void main(String[] args)
    {
        // use this to test is we are hungry are not?
        // you can only have 1 return statement
    }
}
