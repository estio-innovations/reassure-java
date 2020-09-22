package com.estio.oop;

class Car
{
    private String carColor = "grey";
    private String make;
    private String model ="i9";
    private int maxSpeed = 170;

    // Constructor Overloading
    public Car(String makeOfCar, String modelOfCar, int maxSpeedOfCar)
    {
        // set the value of the make,
        this.make = makeOfCar;
        // set the model
        this.model = modelOfCar;
        // set max speed
        this.maxSpeed = maxSpeedOfCar;
    }

    public Car()
    {
    }

    public Car(String colourOfCar)
    {
        this.carColor = colourOfCar;
    }

    public String getMake()
    {
        return this.make;
    }


    public boolean setMake(String newMakeOfCar, int maxSpeed)
    {
        // if the make is not empty then set the new make
        if(newMakeOfCar == "")
        {
            System.out.println("You must include a valid name");
        }
        else
        {
            this.make = newMakeOfCar;
        }

        return true;
    }

    public void setMake(String make)
    {
        // if the make is not empty then set the new make
        if(make == "")
        {
            System.out.println("You must include a valid name");
        }
        else
        {
            this.make = make;
        }
    }
    // getter method
    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }
    // setter method
    public void setMaxSpeed(int newMaxSpeed)
    {
        // set the value of maxSpeed
        // make sure value is above 10
        if(newMaxSpeed > 9)
        {
            this.maxSpeed = newMaxSpeed;
        }
        else
        {
            System.out.println("Must be greater than 10");
        }


    }
    public void describeCar()
    {
        System.out.println("Car Colour is: " + carColor + " Make of car is: " +
                make + " Model is : " + model + " and the Max speed is: " + maxSpeed);
    }

}

class Ford extends Car{}
