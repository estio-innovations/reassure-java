package com.estio.week3;
import com.estio.week3.carrental.LeaseCar;

import java.time.LocalDate;


public class CarRental
{
    LeaseCar bmw;
    LeaseCar citron;
    LeaseCar fait;

    public CarRental()
    {
        setupCarsInit();
    }

    public static void main(String[] args)
    {
        new CarRental();
    }

    public void printAllCarDetails()
    {
        System.out.println(bmw.describeLeasedCar());;
        System.out.println(citron.describeLeasedCar());;
        System.out.println(fait.describeLeasedCar());;
    }

    private void setupCarsInit()
    {
        bmw = new LeaseCar("BMW M5", false, LocalDate.now(), LocalDate.now().plusDays(120));
        citron = new LeaseCar("Picasa", false, LocalDate.now(), LocalDate.now().plusDays(120));
        fait = new LeaseCar("Panda", true, LocalDate.now(), LocalDate.now().plusDays(120));
        printAllCarDetails();
    }

}
