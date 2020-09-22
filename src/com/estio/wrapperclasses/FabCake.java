package com.estio.wrapperclasses;



public class FabCake
{
    private String flavour;
    private float calorieCount;
    private int preperationTime;

    public FabCake(String newFlavour, float newCalorieCount, int newPreperationTime)
    {
        this.flavour = newFlavour;
        this.calorieCount = newCalorieCount;
        this.preperationTime = newPreperationTime;
    }

    public void setFlavour(String newFlavour)
    {
        if(newFlavour != "")
        {
            this.flavour = newFlavour;
        }
        else
        {
            System.out.println("Set a valid flavour");
        }


    }

    public void setPreperationTime(int newPreperationTime)
    {
        if(newPreperationTime > 5)
        {
            this.preperationTime = newPreperationTime;
        }
        else
        {
            System.out.println("Set a valid time");
        }


    }

    public void setCalorieCount(float newCalorieCount)
    {
        if(newCalorieCount > 0)
        {
            this.calorieCount = newCalorieCount;
        }
        else
        {
            System.out.println("Set a valid value");
        }


    }

    public String getFlavour()
    {
        return  this.flavour;
    }

    public float getCalorieCount() {
        return calorieCount;
    }

    public int getPreperationTime() {
        return preperationTime;
    }

    public  String describe()
    {
        return "This cake is made of "+ flavour +
                " it has " + calorieCount + " many calories in it. "+
                " and it takes " + preperationTime + " minutes to bake";
    }

}
