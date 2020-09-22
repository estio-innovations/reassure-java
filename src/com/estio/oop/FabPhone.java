package com.estio.oop;

public class FabPhone
{
    private int storageSpace;
    private String brandName;
    private float screenSize;

    public void setBrandName(String newBrandName)
    {
        if(newBrandName == "")  
        {
            // print error message
        }
        else
        {
            this.brandName = newBrandName;
        }
    }

    public void setStorageSpace(int newStorageSize)
    {
        if(newStorageSize < 16)
        {
            // give error
            System.out.println("Sorry must be greater than 16");
        }
        else
        {
            this.storageSpace = newStorageSize;
        }
    }
    public int getStorageSpace()
    {
        return this.storageSpace;
    }
    public String getBrandName()
    {
        return "The brandname is " + this.brandName;
    }
    public float getScreenSize()
    {
        return this.screenSize;
    }

}
