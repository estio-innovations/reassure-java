package com.estio.week3;
import com.estio.week3.carrental.LeaseCar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * You might choose to complete this class by finishing off the options within the menu method
 * Use the hertz ArrayList to update the list with new lease cars
 *
 * Implement options to add the check the availability of leased cars, lease a car, check remove and even editing of leasing details.
 */
public class CarRental
{
    LeaseCar bmw;
    LeaseCar citron;
    LeaseCar fiat;
    ArrayList<LeaseCar> hertz = new ArrayList<LeaseCar>();

    public CarRental()
    {
        setupCarsInit();
    }

    public void showMenu()
    {
        Scanner userIn = new Scanner(System.in);
        boolean isProgramRunning = true;

        do {
            System.out.println("What whould you like to do?");
            System.out.println("1: display all cars");
            System.out.println("2: add a new car for lease");
            System.out.println("3: Lease a new car");
            System.out.println("9: Exit program");
            Integer choice = userIn.nextInt();
            if(choice == 1)
            {

            }
            else if(choice == 2)
            {
                System.out.println("Displaying all details on cars");
                printAllCarDetails();
            }
            else if(choice == 2)
            {
                System.out.println("add a new car for lease");
            }
            else
            {
                System.out.println();
            }


        }while (isProgramRunning);
    }

    public static void main(String[] args)
    {
        new CarRental();
    }

    public void printAllCarDetails()
    {
        // loop around and get all details
        for(LeaseCar car: hertz)
        {
            System.out.println(car.describeLeasedCar());
        }
    }

    private void setupCarsInit()
    {
        bmw = new LeaseCar("BMW M5", false, LocalDate.now(), LocalDate.now().plusDays(120));
        citron = new LeaseCar("Picasa", false, LocalDate.now(), LocalDate.now().plusDays(120));
        fiat = new LeaseCar("Panda", true, LocalDate.now(), LocalDate.now().plusDays(120));
        hertz.add(bmw);
        hertz.add(citron);
        hertz.add(fiat);
        printAllCarDetails();
    }

}
