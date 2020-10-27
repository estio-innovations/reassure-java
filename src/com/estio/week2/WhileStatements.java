package com.estio.week2;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Using a while loop, print off numbers 1 - 10;
 *
 * Create an instance of the Scanner to read input from the user:
 *
 * Scanner scanner = new Scanner(System.in); 
 * String userInput;
 *
 * userInput = scanner.nextLine();
 *
 * Create an infinate loop using 'userInput'
 * Using the user input, control the while loop to stop when the user enters in "stop"
 *
 * TASK: Build a program that will print of the multiplication of 2 numbers.
 * 	We create a while loop - infinate,
 * 	Ask user for number 1
 * 	store it
 * 	Ask user for number 2
 * 	multiply number 1 with number 2
 * 	print out the value
 *
 * Ask the user do they want to continue?
 *
 * Quit application with user input
 *
 * You can put hands up at this point!!!!
 *
 * -- Create a menu to explain the application.
 * Press 1 for add
 * Press 2 for multiply
 * Press 3 for divide
 * Press 4 for subtract
 *
 * press 123 for exit;
 *
 * Add exception handling
 *
 * If you manage to complete this: add an additional option to print out times table of a given number.
 * eg: Insert a number to see times table to 10: 5
 * 5 * 1 = 5
 * 5 * 2 = 10
 */
public class WhileStatements {
    public static void main(String[] args) {
        //exampleOne();
        //exampleOfLoop();
        exampleDoWhile();
    }

    public static void exampleOne() {
        boolean isProgramEnded = false;
        // take in input from user
        Scanner userInput = new Scanner(System.in);

        float num1 = 0, num2 = 0, option = 0;
        float result;

        StartOfProgram:
        while (!isProgramEnded)
        {
            try
            {
                System.out.println("Would you like to continue or quit? " +
                        "1 : Add"+
                        "2 : Divide"+
                        "Continue press 1 or quit press 123");

                option = userInput.nextInt();

                if(option == 1)
                {
                    System.out.println("Do an addition");
                }
                else if (option == 2)
                {
                    System.out.println("Number 1:");
                    num1 = userInput.nextFloat();

                    System.out.println("Number 2:");
                    num2 = userInput.nextFloat();

                    result = num1 / num2;
                    System.out.println("The result of " + num1 + "/" + num2 + " = " + result);
                }
                else if (option == 123)
                {
                    System.exit(0);
                }







                if (option == 123)
                {
                    isProgramEnded = true;
                }
            }
            catch (java.util.InputMismatchException ex)
            {
                isProgramEnded = false;
                ex.printStackTrace();
                System.out.println(ex.toString());
                ;
                System.out.println("There was an error in your selection, try again?");
                exampleOne();
            }
        }
    }

    public static void exampleOfLoop()
    {
        boolean isProgEnded = false;
        Scanner userIn = new Scanner(System.in);

        int option = 0;

        System.out.println("What would you like it do?\n\t" +
                "1: add 2 numbers\n\t"+
                "2: divide 2 numbers\n\t"+
                "123 to quit\n\t");

        try
        {
           option = userIn.nextInt();
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Error In option selected");
            exampleOfLoop();
        }

        if(option == 123)
        {
            System.exit(0);
        }
        else
        {
            while (!isProgEnded)
            {
                if(option == 1)
                {
                    System.out.println("preform an add");
                    exampleOfLoop();
                }
                else if(option == 2)
                {
                    System.out.println("preform an divide");
                }
            }
        }
    }

    public static void menu()
    {
        System.out.println("");
    }

    public static void exampleDoWhile()
    {
        int counter = 0;

        do {
            counter++;
        }while (counter>10);

        System.out.println(counter);

        // do while will a least perfom the body once.



//        while(false)
//        {
//
//        }
    }
}
