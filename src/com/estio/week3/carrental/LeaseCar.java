package com.estio.week3.carrental;

import java.time.LocalDate;
import java.time.Period;

public class LeaseCar
{
    private String nameOfCar;
    private boolean isCurrentlyLeased;
    private LocalDate leaseStartDate;
    private LocalDate leaseEndDate;

    private Period defaultLeasePeriod = Period.of(0,3,0);

    public String getNameOfCar()
    {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar)
    {
        if(nameOfCar != "")
        {
            this.nameOfCar = nameOfCar;
        }
        else
        {
            System.out.println("Name of car, can not be empty");
            this.nameOfCar = "Unnamed Car";
        }
    }

    public boolean isCurrentlyLeased()
    {
        return isCurrentlyLeased;
    }

    public void setCurrentlyLeased(boolean currentlyLeased)
    {
        isCurrentlyLeased = currentlyLeased;
    }

    public LocalDate getLeaseStartDate()
    {
        return leaseStartDate;
    }

    public void setLeaseStartDate(LocalDate leaseStartDate)
    {
        // check to see if this is a date in the future!!
        if(leaseStartDate.isAfter(LocalDate.now()))
        {
            this.leaseStartDate = leaseStartDate;
        }
        else
        {
            System.out.println("Can't set the date to a date in the past\nSetting to today instead");
            this.leaseStartDate = LocalDate.now();
        }
    }

    public LocalDate getLeaseEndDate()
    {
        return leaseEndDate;
    }

    public void setLeaseEndDate(LocalDate leaseEndDate)
    {
        // check for this end date to be after the current start date
        if(leaseEndDate.isAfter(this.leaseEndDate) )
        {
            this.leaseEndDate = leaseEndDate;
        }
        else
        {
            System.out.println("Date not set, check it's a date in the future, default end set");
            this.leaseEndDate = leaseEndDate.plus(defaultLeasePeriod);
        }
    }

    public LeaseCar(String nameOfCar, boolean isCurrentlyLeased, LocalDate leaseStartDate, LocalDate leaseEndDate)
    {
        this.nameOfCar = nameOfCar;
        this.isCurrentlyLeased = isCurrentlyLeased;
        this.leaseStartDate = leaseStartDate;
        this.leaseEndDate = leaseEndDate;
    }

    /**
     *
     * @return carDetails
     */
    public String describeLeasedCar()
    {
        String description = null;
        if(this.isCurrentlyLeased)
        {
            // explain the car is leased and display information
            description = this.nameOfCar + " is currently leased, Leased from:" +
                    ""+ this.leaseStartDate + " Leased to: " + this.leaseEndDate;
        }
        else
        {
            // explain the is not leased and display information
            description = this.nameOfCar + " is not currently under lease";
        }
        return description;
    }


}
