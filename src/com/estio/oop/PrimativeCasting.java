package com.estio.oop;

public class PrimativeCasting
{
    public static boolean oldEnoughToDrink(int age)
    {
        boolean ans;
        if (age > 18)
        {
            ans = true;
        }
        else
        {
            ans = false;
        }
        return ans ;

    }

    public static void main(String[] args) {
        /*byte myByte =(byte) 130;

        System.out.println(myByte);

        Compare c1 = new Compare();
        Compare c2 = new Compare();
        System.out.println(5 == 5);
        System.out.println(c1);
        System.out.println(c2);
        */

        if(oldEnoughToDrink(45))
        {

        }
        int age = 5;




    }
}


class Compare
{
    public Compare()
    {
        System.out.println(this);
    }
}