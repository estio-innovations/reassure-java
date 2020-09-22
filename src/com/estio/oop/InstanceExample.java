package com.estio.oop;

public class InstanceExample
{
    String name;
    public InstanceExample()
    {
        System.out.println("Called the constructor");
        float myFloat = 15465451.1245f;
        Integer myInt = null;
    }

    {
        name = "Josh";
        System.out.println("Boom Shakalaka");
    }

    public static void main(String[] args) {
        double x  = 1.21;
        System.out.println(x); // 1.21

        x = -x;
        System.out.println(x); // -1.21

        x = -x;
        System.out.println(x); // -1.21

    }
}
