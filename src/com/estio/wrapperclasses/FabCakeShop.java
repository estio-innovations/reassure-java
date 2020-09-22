package com.estio.wrapperclasses;


public class FabCakeShop
{
    public static void main(String[] args)
    {
        java.util.ArrayList fabList = new java.util.ArrayList();

        FabCake choccyCake = new FabCake("Chocolate", 320, 50);

        System.out.println(choccyCake.describe() + " if you would like some, please ask!");
    }
}
