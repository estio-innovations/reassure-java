package com.estio.oop;

public class GCollection
{
    public static void main(String[] args)
    {
        for (int i = 0; i< 5 ; i++) {
            new FabCar();
        }
        System.out.println("- - - - - - - - - -");

        for (int i = 0; ; i++) {
            new FabCar();
        }
    }
}

class FabCar
{
    public FabCar()
    {
        super();
        System.out.println("Object on the heap at: "+ this);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object removed from heap ****************************************************************************");
    }
}