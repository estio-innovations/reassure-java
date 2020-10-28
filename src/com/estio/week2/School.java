package com.estio.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class School
{
    public static void main(String[] args)
    {
        menu();
    }

    public static void menu()
    {
        boolean isProgramEnded = false;
        Scanner userInput = new Scanner(System.in);

        int choice = 0;

        System.out.println("" +
                "What would you like to do\n" +
                "\tPress 1 for ...\n"+
                "\tPress 2 for ...\n"+
                "\tPress 3 for ...\n"+
                "\t123 to quit"+
                "");

        try
        {
            choice = userInput.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Error option selected");
        }

        if(choice == 123)
        {
            // quit application
            System.exit(0);
        }
        else
        {
            while(!isProgramEnded)
            {
                if(choice == 1)
                {
                    // do what 1 does
                    System.out.println("    Option 1 selected");
                    menu();
                }
                else if (choice == 2)
                {
                    System.out.println("Option 2 selected");
                    menu();

                }
                else if (choice == 3)
                {
                    System.out.println("Option 3 selected");
                    menu();
                }
                else
                {
                    System.out.println("Enter a valid choice");
                    menu();
                }
            }
        }
    }
}
